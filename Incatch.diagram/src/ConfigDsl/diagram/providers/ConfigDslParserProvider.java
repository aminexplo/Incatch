/*
 * 
 */
package ConfigDsl.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ConfigDslParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser projectName_5001Parser;

	/**
	* @generated
	*/
	private IParser getProjectName_5001Parser() {
		if (projectName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConfigDsl.ConfigDslPackage.eINSTANCE.getProject_Name() };
			ConfigDsl.diagram.parsers.MessageFormatParser parser = new ConfigDsl.diagram.parsers.MessageFormatParser(
					features);
			projectName_5001Parser = parser;
		}
		return projectName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser simpleStringFieldName_5002Parser;

	/**
	* @generated
	*/
	private IParser getSimpleStringFieldName_5002Parser() {
		if (simpleStringFieldName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConfigDsl.ConfigDslPackage.eINSTANCE.getSimpleStringField_Name() };
			ConfigDsl.diagram.parsers.MessageFormatParser parser = new ConfigDsl.diagram.parsers.MessageFormatParser(
					features);
			simpleStringFieldName_5002Parser = parser;
		}
		return simpleStringFieldName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser dynamicListFieldName_5003Parser;

	/**
	* @generated
	*/
	private IParser getDynamicListFieldName_5003Parser() {
		if (dynamicListFieldName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ConfigDsl.ConfigDslPackage.eINSTANCE.getDynamicListField_Name() };
			ConfigDsl.diagram.parsers.MessageFormatParser parser = new ConfigDsl.diagram.parsers.MessageFormatParser(
					features);
			dynamicListFieldName_5003Parser = parser;
		}
		return dynamicListFieldName_5003Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ConfigDsl.diagram.edit.parts.ProjectNameEditPart.VISUAL_ID:
			return getProjectName_5001Parser();
		case ConfigDsl.diagram.edit.parts.SimpleStringFieldNameEditPart.VISUAL_ID:
			return getSimpleStringFieldName_5002Parser();
		case ConfigDsl.diagram.edit.parts.DynamicListFieldNameEditPart.VISUAL_ID:
			return getDynamicListFieldName_5003Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ConfigDsl.diagram.providers.ConfigDslElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
