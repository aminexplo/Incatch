/*
 * 
 */
package ConfigDsl.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ConfigDslModelingAssistantProviderOfConfigEditPart
		extends ConfigDsl.diagram.providers.ConfigDslModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ConfigDsl.diagram.providers.ConfigDslElementTypes.Project_2001);
		types.add(ConfigDsl.diagram.providers.ConfigDslElementTypes.SimpleStringField_2002);
		types.add(ConfigDsl.diagram.providers.ConfigDslElementTypes.DynamicListField_2003);
		return types;
	}

}
