package com.hexane.main.core.atom;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class CarbonAtom extends Atom {

	private static final String NAME = "C";
	private static final int VALENCY = 4;
	private static final int[] CONN_DEGS = { 90, 200, 270, 340 }; 
	
	public CarbonAtom( Point2D location, GraphicsContext g ) {
		super( NAME, VALENCY, CONN_DEGS, location, g );
	}
}
