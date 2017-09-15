package com.hexane.tests.core.atom;

import com.hexane.main.core.atom.CarbonAtom;
import com.hexane.main.core.atom.HydrogenAtom;
import com.hexane.main.core.atom.OxygenAtom;

public class AtomTest {

	public static void main( String args[] ) {
		CarbonAtom a1 = new CarbonAtom( null, null );
		HydrogenAtom a2 = new HydrogenAtom( null, null );
		HydrogenAtom a3 = new HydrogenAtom( null, null );
		HydrogenAtom a4 = new HydrogenAtom( null, null );
		OxygenAtom a5 = new OxygenAtom( null, null );
		HydrogenAtom a6 = new HydrogenAtom( null, null );
		
		a1.connectAtomToRight( a2 );
		a1.connectAtomToRight( a3 );
		a1.connectAtomToRight( a4 );
		a1.connectAtomToRight( a5 );
		a5.connectAtomToRight( a6 );

		a1.getBonds().forEach( (e) -> {
			System.out.println( e.toString() );
		});
		a5.getBonds().forEach( (e) -> System.out.println( e.toString() ) );
	}
	
}
