
/*
 * 
 */
package ConstraintDsl.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ConstraintDslPaletteFactory {

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
		PaletteDrawer paletteContainer = new PaletteDrawer(ConstraintDsl.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createRangeRule1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createRangeRule1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ConstraintDsl.diagram.part.Messages.RangeRule1CreationTool_title,
				ConstraintDsl.diagram.part.Messages.RangeRule1CreationTool_desc,
				Collections.singletonList(ConstraintDsl.diagram.providers.ConstraintDslElementTypes.RangeRule_2001));
		entry.setId("createRangeRule1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConstraintDsl.diagram.providers.ConstraintDslElementTypes
				.getImageDescriptor(ConstraintDsl.diagram.providers.ConstraintDslElementTypes.RangeRule_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
