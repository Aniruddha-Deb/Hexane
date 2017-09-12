package com.hexane.main.core.visual;

import com.hexane.main.core.data.InstructionList;

import javafx.scene.canvas.Canvas;

public class CanvasManager {
	
	private Canvas canvas = null;
	
	public CanvasManager( Canvas canvas ) {
		this.canvas = canvas;
	}	
	
	public void draw( InstructionList l ) {
		// TODO implement a basic drawing language
		canvas.getGraphicsContext2D().fillRect( 0, 0, canvas.getWidth(), canvas.getHeight() );
	}
}
