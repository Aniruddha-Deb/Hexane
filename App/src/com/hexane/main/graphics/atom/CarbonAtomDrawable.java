package com.hexane.main.graphics.atom;

import com.hexane.main.graphics.Drawable;

import javafx.scene.canvas.GraphicsContext;

public class CarbonAtomDrawable implements Drawable {
	
	private static String name = "C";
	
	private static int valency = 4;
	private static int[] connDegrees = { 0, 110, 180, 250 };

	@Override
	public void render( GraphicsContext g ){
		
	}

	@Override
	public void erase( GraphicsContext g ){
		
	}
}
