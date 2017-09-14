package com.hexane.main.graphics.atom.data;

import javafx.geometry.Point2D;

public class OxygenAtomRenderData extends AtomRenderData{

	public OxygenAtomRenderData( Point2D location ) {
		super( "O", 2, new int[]{90, 270}, location );
	}
}
