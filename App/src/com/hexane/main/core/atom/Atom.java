package com.hexane.main.core.atom;

import java.util.ArrayList;
import java.util.List;

import com.hexane.main.graphics.atom.AtomRenderer;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public abstract class Atom {

	private String name = null;
	private int valency = 0;
	private int[] connectionDegs = null;
	private Point2D location = null;
	
	private AtomRenderer renderer = null;
	
	private List<Bond> bonds = null;
	
	protected Atom( String name, int valency, int[] connectionDegs, 
					Point2D location, GraphicsContext g ) {
		this.name = name;
		this.valency = valency;
		this.connectionDegs = connectionDegs;
		this.location = location;
		
		this.renderer = new AtomRenderer( this, g );
		this.bonds = new ArrayList<>();
	}
	
	public void connectAtomToRight( Atom a ) {
		this.addBond( new Bond( this, a ) );
		a.addBond(    new Bond( this, a ) );
	}
	
	public void connectAtomToLeft( Atom a ) {
		this.addBond( new Bond( a, this ) );
		a.addBond(    new Bond( a, this ) );
	}
	
	public void addBond( Bond b ) throws IllegalArgumentException {
		if( valency < bonds.size()+1 ) {
			throw new IllegalArgumentException( "Atom " + name + " is full" );
		}
		bonds.add( b );		
	}
	
	public String getName(){
		return name;
	}
	
	public int getValency(){
		return valency;
	}
	
	public int[] getConnectionDegs(){
		return connectionDegs;
	}
	
	public Point2D getLocation(){
		return location;
	}
	
	public List<Bond> getBonds(){
		return bonds;
	}
}
