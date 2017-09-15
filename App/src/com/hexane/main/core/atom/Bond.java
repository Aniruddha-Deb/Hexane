package com.hexane.main.core.atom;

public class Bond {

	private Atom rightAtom = null;
	private Atom leftAtom = null;
	
	public Bond( Atom leftAtom, Atom rightAtom ) {
		this.rightAtom = rightAtom;
		this.leftAtom = leftAtom;
	}
	
	public Atom getLeftAtom(){
		return leftAtom;
	}

	public Atom getRightAtom(){
		return rightAtom;
	}
	
	@Override
	public String toString(){
		return leftAtom.getName() + "-" + rightAtom.getName();
	}
}
