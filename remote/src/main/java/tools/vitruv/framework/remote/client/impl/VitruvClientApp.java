package tools.vitruv.framework.remote.client.impl;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import tools.vitruv.framework.remote.common.DefaultConnectionSettings;


public class VitruvClientApp {
    public static void main(String[] args) {

        final String protocol = DefaultConnectionSettings.STD_PROTOCOL;
        final String hostOrIp = DefaultConnectionSettings.STD_HOST;
        final int serverPort = DefaultConnectionSettings.STD_PORT;

        final Path tempDir = Paths.get("tmp/vitruvModels");

        // Connect to Server
        final var remoteConnection = new VitruvRemoteConnection(protocol, hostOrIp, serverPort, tempDir);

//        String uuid = UUID.randomUUID().toString();
//        Resource selection = getResource(); // TODO
//
//        RemoteViewSelector viewSelector = new RemoteViewSelector(uuid, selection, remoteConnection);
//
//        // Abrufen einer View vom Server
//        RemoteView view = remoteConnection.getView(viewSelector);

        final var viewTypes = remoteConnection.getViewTypes();
        final var selector = remoteConnection.getSelector("xxx");


        // Hier kannst du mit der View weiterarbeiten
        System.out.println("Server Antwort #viewTypes: " + viewTypes.iterator().next().getName());
        System.out.println("Server Antwort #viewTypes: " + viewTypes.iterator().next().toString());

        System.out.println("Server Antwort #selector: " + selector.getUUID());

    }

    private static Resource getResource() {
        return new Resource() {
            @Override
            public ResourceSet getResourceSet() {
                return null;
            }

            @Override
            public URI getURI() {
                return null;
            }

            @Override
            public void setURI(URI uri) {

            }

            @Override
            public long getTimeStamp() {
                return 0;
            }

            @Override
            public void setTimeStamp(long timeStamp) {

            }

            @Override
            public EList<EObject> getContents() {
                return null;
            }

            @Override
            public TreeIterator<EObject> getAllContents() {
                return null;
            }

            @Override
            public String getURIFragment(EObject eObject) {
                return null;
            }

            @Override
            public EObject getEObject(String uriFragment) {
                return null;
            }

            @Override
            public void save(Map<?, ?> options) throws IOException {

            }

            @Override
            public void load(Map<?, ?> options) throws IOException {

            }

            @Override
            public void save(OutputStream outputStream, Map<?, ?> options) throws IOException {

            }

            @Override
            public void load(InputStream inputStream, Map<?, ?> options) throws IOException {

            }

            @Override
            public boolean isTrackingModification() {
                return false;
            }

            @Override
            public void setTrackingModification(boolean isTrackingModification) {

            }

            @Override
            public boolean isModified() {
                return false;
            }

            @Override
            public void setModified(boolean isModified) {

            }

            @Override
            public boolean isLoaded() {
                return false;
            }

            @Override
            public void unload() {

            }

            @Override
            public void delete(Map<?, ?> options) throws IOException {

            }

            @Override
            public EList<Diagnostic> getErrors() {
                return null;
            }

            @Override
            public EList<Diagnostic> getWarnings() {
                return null;
            }

            @Override
            public EList<Adapter> eAdapters() {
                return null;
            }

            @Override
            public boolean eDeliver() {
                return false;
            }

            @Override
            public void eSetDeliver(boolean b) {

            }

            @Override
            public void eNotify(Notification notification) {

            }
        };
    }
}