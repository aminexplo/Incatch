/*
 * 
 */
package ConfigDsl.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ConfigDslElementTypes {

	/**
	* @generated
	*/
	private ConfigDslElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Config_1000 = getElementType("Incatch.diagram.Config_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Project_2001 = getElementType("Incatch.diagram.Project_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SimpleStringField_2002 = getElementType("Incatch.diagram.SimpleStringField_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DynamicListField_2003 = getElementType("Incatch.diagram.DynamicListField_2003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Config_1000, ConfigDsl.ConfigDslPackage.eINSTANCE.getConfig());

			elements.put(Project_2001, ConfigDsl.ConfigDslPackage.eINSTANCE.getProject());

			elements.put(SimpleStringField_2002, ConfigDsl.ConfigDslPackage.eINSTANCE.getSimpleStringField());

			elements.put(DynamicListField_2003, ConfigDsl.ConfigDslPackage.eINSTANCE.getDynamicListField());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Config_1000);
			KNOWN_ELEMENT_TYPES.add(Project_2001);
			KNOWN_ELEMENT_TYPES.add(SimpleStringField_2002);
			KNOWN_ELEMENT_TYPES.add(DynamicListField_2003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ConfigDsl.diagram.edit.parts.ConfigEditPart.VISUAL_ID:
			return Config_1000;
		case ConfigDsl.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return Project_2001;
		case ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart.VISUAL_ID:
			return SimpleStringField_2002;
		case ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart.VISUAL_ID:
			return DynamicListField_2003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return ConfigDsl.diagram.providers.ConfigDslElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ConfigDsl.diagram.providers.ConfigDslElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ConfigDsl.diagram.providers.ConfigDslElementTypes.getElement(elementTypeAdapter);
		}
	};

}
