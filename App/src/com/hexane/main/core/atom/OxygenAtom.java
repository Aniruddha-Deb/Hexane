package com.hexane.main.core.atom;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class OxygenAtom extends Atom {

	private static final String NAME = "O";
	private static final int VALENCY = 2;
	private static final int[] CONN_DEGS = { 0, 180 }; 
	
	public OxygenAtom( Point2D location, GraphicsContext g ) {
		super( NAME, VALENCY, CONN_DEGS, location, g );
	}
}
