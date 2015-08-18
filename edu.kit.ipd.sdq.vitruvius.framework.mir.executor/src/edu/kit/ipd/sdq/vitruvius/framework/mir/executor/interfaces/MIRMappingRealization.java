package edu.kit.ipd.sdq.vitruvius.framework.mir.executor.interfaces;

import java.util.List;

import org.eclipse.emf.common.command.Command;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.Blackboard;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.EChange;

/**
 * Represents a MIR mapping. Concrete implementations are generated by
 * {@link MIRCodeGenerator}.
 * @author Dominik Werle
 *
 */
public interface MIRMappingRealization {
	/**
	 * Applies the mapping.
	 * @param eChange
	 * @param correspondenceInstance
	 * @return the resulting change
	 */
	public List<Command> applyEChange(EChange eChange, Blackboard blackboard);
	
	/**
	 * Returns an ID that is unique for all mapping realizations.
	 * @return
	 */
	public String getMappingID();
}
