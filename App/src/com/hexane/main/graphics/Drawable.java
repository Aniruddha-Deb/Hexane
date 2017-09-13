package com.hexane.main.graphics;

import javafx.scene.canvas.GraphicsContext;

public interface Drawable {
	
	public void render( GraphicsContext g );

	public void erase( GraphicsContext g );
}
