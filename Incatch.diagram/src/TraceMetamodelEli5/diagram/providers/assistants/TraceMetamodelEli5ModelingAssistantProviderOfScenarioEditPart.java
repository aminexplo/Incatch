/*
 * 
 */
package TraceMetamodelEli5.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TraceMetamodelEli5ModelingAssistantProviderOfScenarioEditPart
		extends TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.Rule_2001);
		return types;
	}

}
