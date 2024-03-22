
/*
 * 
 */
package ConfigDsl.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ConfigDslPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(ConfigDsl.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDynamicListField1CreationTool());
		paletteContainer.add(createDynamicListItem2CreationTool());
		paletteContainer.add(createProject3CreationTool());
		paletteContainer.add(createSimpleStringField4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createDynamicListField1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ConfigDsl.diagram.part.Messages.DynamicListField1CreationTool_title,
				ConfigDsl.diagram.part.Messages.DynamicListField1CreationTool_desc,
				Collections.singletonList(ConfigDsl.diagram.providers.ConfigDslElementTypes.DynamicListField_2003));
		entry.setId("createDynamicListField1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConfigDsl.diagram.providers.ConfigDslElementTypes
				.getImageDescriptor(ConfigDsl.diagram.providers.ConfigDslElementTypes.DynamicListField_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDynamicListItem2CreationTool() {
		ToolEntry entry = new ToolEntry(ConfigDsl.diagram.part.Messages.DynamicListItem2CreationTool_title,
				ConfigDsl.diagram.part.Messages.DynamicListItem2CreationTool_desc, null, null) {
		};
		entry.setId("createDynamicListItem2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProject3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ConfigDsl.diagram.part.Messages.Project3CreationTool_title,
				ConfigDsl.diagram.part.Messages.Project3CreationTool_desc,
				Collections.singletonList(ConfigDsl.diagram.providers.ConfigDslElementTypes.Project_2001));
		entry.setId("createProject3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConfigDsl.diagram.providers.ConfigDslElementTypes
				.getImageDescriptor(ConfigDsl.diagram.providers.ConfigDslElementTypes.Project_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSimpleStringField4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ConfigDsl.diagram.part.Messages.SimpleStringField4CreationTool_title,
				ConfigDsl.diagram.part.Messages.SimpleStringField4CreationTool_desc,
				Collections.singletonList(ConfigDsl.diagram.providers.ConfigDslElementTypes.SimpleStringField_2002));
		entry.setId("createSimpleStringField4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConfigDsl.diagram.providers.ConfigDslElementTypes
				.getImageDescriptor(ConfigDsl.diagram.providers.ConfigDslElementTypes.SimpleStringField_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
