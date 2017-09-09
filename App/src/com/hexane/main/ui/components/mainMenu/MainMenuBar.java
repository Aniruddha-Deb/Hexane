package com.hexane.main.ui.components.mainMenu;

import com.hexane.main.ui.components.mainMenu.menus.FileMenu;
import com.hexane.main.ui.controller.Controller;

import javafx.scene.control.MenuBar;

public class MainMenuBar extends MenuBar {

	public MainMenuBar( Controller c ) {
		super();
		setupMenus( c );
	}
	
	private void setupMenus( Controller c ) {
		super.getMenus().add( new FileMenu( c ) );
	}	
}
