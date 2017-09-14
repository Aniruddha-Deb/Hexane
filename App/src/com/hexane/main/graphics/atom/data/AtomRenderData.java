package com.hexane.main.graphics.atom.data;

import javafx.geometry.Point2D;

public class AtomRenderData {
	
	private String name = null;
	private int valency = -1;
	private int[] bondDegrees = null;
	private Point2D location = null;
	
	protected AtomRenderData( String name, int valency, int[] bondDegrees, 
								Point2D location ) {
		this.name = name;
		this.valency = valency;
		this.bondDegrees = bondDegrees;
		this.location = location;
	}
	
	public String getName(){
		return name;
	}
	
	public int getValency(){
		return valency;
	}
	
	public int[] getBondDegrees(){
		return bondDegrees;
	}
	
	public Point2D getCoordinates(){
		return location;
	}
}
