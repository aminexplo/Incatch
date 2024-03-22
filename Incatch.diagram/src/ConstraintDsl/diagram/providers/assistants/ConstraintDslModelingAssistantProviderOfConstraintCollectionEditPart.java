/*
 * 
 */
package ConstraintDsl.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ConstraintDslModelingAssistantProviderOfConstraintCollectionEditPart
		extends ConstraintDsl.diagram.providers.ConstraintDslModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ConstraintDsl.diagram.providers.ConstraintDslElementTypes.RangeRule_2001);
		return types;
	}

}
