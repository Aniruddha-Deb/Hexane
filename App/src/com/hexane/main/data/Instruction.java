package com.hexane.main.data;

import javafx.geometry.Point2D;
import javafx.scene.image.Image;

public class Instruction {

	private Point2D coordinate = null;
	private Image   drawable   = null;
	
	public Instruction( Point2D coordinates, Image drawable ) {
		this.drawable = drawable;
		this.coordinate = coordinates;
	}

	public Image getDrawable() {
		return drawable;
	}
	
	public Point2D getCoordinates() {
		return coordinate;
	}
	
}
