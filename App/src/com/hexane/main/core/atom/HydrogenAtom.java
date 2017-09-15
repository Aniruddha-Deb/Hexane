package com.hexane.main.core.atom;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class HydrogenAtom extends Atom {

	private static final String NAME = "H";
	private static final int VALENCY = 1;
	private static final int[] CONN_DEGS = { 180 }; 
	
	public HydrogenAtom( Point2D location, GraphicsContext g ) {
		super( NAME, VALENCY, CONN_DEGS, location, g );
	}
}
