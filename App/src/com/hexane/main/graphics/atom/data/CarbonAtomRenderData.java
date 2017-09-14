package com.hexane.main.graphics.atom.data;

import javafx.geometry.Point2D;

public class CarbonAtomRenderData extends AtomRenderData {

	public CarbonAtomRenderData( Point2D location ) {
		super( "C", 4, new int[]{0, 110, 180, 250}, location );
	}
}
