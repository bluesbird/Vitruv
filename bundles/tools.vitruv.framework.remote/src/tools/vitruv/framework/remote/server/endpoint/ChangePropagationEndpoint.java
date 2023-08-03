package tools.vitruv.framework.remote.server.endpoint;

import tools.vitruv.change.atomic.root.InsertRootEObject;
import tools.vitruv.change.composite.description.VitruviusChange;
import tools.vitruv.framework.remote.common.util.constants.Header;
import tools.vitruv.framework.remote.common.util.HttpExchangeWrapper;
import tools.vitruv.framework.remote.common.util.Cache;
import tools.vitruv.framework.views.impl.ModifiableView;
import tools.vitruv.framework.views.impl.ViewCreatingViewType;
import tools.vitruv.framework.remote.common.util.JsonMapper;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * This endpoint applies given {@link VitruviusChange}s to the VSUM.
 */
public class ChangePropagationEndpoint implements Endpoint.Patch {

	@SuppressWarnings("unchecked")
	@Override
    public String process(HttpExchangeWrapper wrapper) {
        var view = Cache.getView(wrapper.getRequestHeader(Header.VIEW_UUID));
        if (view == null) {
            throw notFound("View with given id not found!");
        }
        try {
            var body = wrapper.getRequestBodyAsString();
            var change = JsonMapper.deserialize(body, VitruviusChange.class);
            change.getEChanges().forEach(it -> {
            	if (it instanceof InsertRootEObject<?> echange) {
            		echange.setResource(new ResourceImpl(URI.createURI(echange.getUri())));
				}
            });
            var type = (ViewCreatingViewType<? , ?>) view.getViewType();
            type.commitViewChanges((ModifiableView) view, change);
            return null;
        } catch (IOException e) {
            throw internalServerError(e.getMessage());
        }
    }
}
