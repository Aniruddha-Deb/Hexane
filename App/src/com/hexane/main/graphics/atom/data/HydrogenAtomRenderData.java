package com.hexane.main.graphics.atom.data;

import javafx.geometry.Point2D;

public class HydrogenAtomRenderData extends AtomRenderData {
	
	public HydrogenAtomRenderData( Point2D location ) {
		super( "H", 1, new int[]{270}, location );
	}
}
