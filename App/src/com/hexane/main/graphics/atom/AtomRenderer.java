package com.hexane.main.graphics.atom;

import com.hexane.main.core.atom.Atom;

import javafx.scene.canvas.GraphicsContext;

public class AtomRenderer {

	private GraphicsContext g = null;
	private Atom atom = null;
	
	public AtomRenderer( Atom atom, GraphicsContext g ) {
		this.g = g;
		this.atom = atom;
	}

	public void render() {
		// TODO render atom using g.
	}
}
