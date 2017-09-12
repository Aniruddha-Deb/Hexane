package com.hexane.main.ui.components;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class FileTab extends Tab{

	private Canvas canvas = null;
	
	public FileTab( String value, TabPane p ) {
		super( value );
		canvas = new Canvas();
		canvas.widthProperty().bind( p.widthProperty() );
		canvas.heightProperty().bind( p.heightProperty() );
		super.setContent( canvas );		
	}
	
	public Canvas getCanvas(){
		return canvas;
	}
}
