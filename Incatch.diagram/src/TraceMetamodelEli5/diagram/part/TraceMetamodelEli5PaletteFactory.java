
/*
 * 
 */
package TraceMetamodelEli5.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class TraceMetamodelEli5PaletteFactory {

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
		PaletteDrawer paletteContainer = new PaletteDrawer(
				TraceMetamodelEli5.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createRule1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createRule1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceMetamodelEli5.diagram.part.Messages.Rule1CreationTool_title,
				TraceMetamodelEli5.diagram.part.Messages.Rule1CreationTool_desc, Collections
						.singletonList(TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.Rule_2001));
		entry.setId("createRule1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes
				.getImageDescriptor(TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.Rule_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
