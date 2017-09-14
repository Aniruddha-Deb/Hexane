package com.hexane.main.graphics.atom;

import com.hexane.main.graphics.atom.data.AtomRenderData;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class AtomRenderer {

	private GraphicsContext g = null;
	
	public AtomRenderer( GraphicsContext g ) {
		this.g = g;
	}
	
	public void render( AtomRenderData data ) {
		g.setFill( Color.BLACK );
		g.setFont( new Font( "Helvetica", 16 ) );
		g.fillText( data.getName(), data.getCoordinates().getX(), data.getCoordinates().getX() );
	}
	
}
