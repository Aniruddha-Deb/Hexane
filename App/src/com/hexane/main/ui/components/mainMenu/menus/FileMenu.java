package com.hexane.main.ui.components.mainMenu.menus;

import com.hexane.main.ui.controller.Controller;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;

public class FileMenu extends Menu{
	
	private FileChooser fileChooser = null;
	private Controller controller = null;
	
	public FileMenu( Controller c ) {		
		super( "File" );
		super.getItems().add( createNewFileMenuItem() );
		super.getItems().add( createOpenFileMenuItem() );
		super.getItems().add( createSaveFileMenuItem() );
		
		this.controller = c;
		
		fileChooser = new FileChooser();
	}
	
	private MenuItem createNewFileMenuItem() {
		MenuItem newFile = new MenuItem( "New" );
		newFile.setOnAction( (t) -> {
			// TODO implement this
		});
		return newFile;
	}
	
	private MenuItem createOpenFileMenuItem() {
		MenuItem openFile = new MenuItem( "Open" );
		openFile.setOnAction( (t) -> {
			// TODO implement open functionality
			fileChooser.showOpenDialog( controller.getPrimaryStage() );
         });
		return openFile;		
	}
	
	private MenuItem createSaveFileMenuItem() {
		MenuItem saveFile = new MenuItem( "Save" );
		saveFile.setOnAction( (t) -> {
			// TODO implement save functionality
			fileChooser.showSaveDialog( controller.getPrimaryStage() );
		});
		return saveFile;		
	}
	
}
