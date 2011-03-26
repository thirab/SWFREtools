package tv.porst.swfretools.dissector.gui.main.flashtree.nodes;

import tv.porst.swfretools.dissector.gui.main.flashtree.FlashTreeNode;
import tv.porst.swfretools.parser.structures.TextRecord2;

public class FlashTextRecord2Node extends FlashTreeNode<TextRecord2> {

	public FlashTextRecord2Node(final String name, final TextRecord2 textRecord) {
		super(name, textRecord);

		createChildren();
	}

	private void createChildren() {
		addNode("TextRecordType", getUserObject().getTextRecordType());
		addNode("StyleFlagsReserved", getUserObject().getStyleFlagsReserved());
		addNode("StyleFlagsHasFont", getUserObject().getStyleFlagsHasFont());
		addNode("StyleFlagsHasColor", getUserObject().getStyleFlagsHasColor());
		addNode("StyleFlagsHasYOffset", getUserObject().getStyleFlagsHasYOffset());
		addNode("StyleFlagsHasXOffset", getUserObject().getStyleFlagsHasXOffset());
		addNode("FontID", getUserObject().getFontId());
		addNode("TextColor", getUserObject().getTextColor());
		addNode("XOffset", getUserObject().getxOffset());
		addNode("YOffset", getUserObject().getyOffset());
		addNode("TextHeight", getUserObject().getTextHeight());
		addNode("GlyphCount", getUserObject().getGlyphCount());
		addNode("GlyphEntries", getUserObject().getGlyphEntries());
	}

	@Override
	public String toString() {
		return String.format("%s : TEXTRECORD", getName());
	}
}