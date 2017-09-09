package com.hexane.main.ui.controller.fileviewer;

import java.nio.file.Files;
import java.nio.file.Path;

import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FilePathTreeItem extends TreeItem<String>{

	public static Image folderImage = new Image(  
		FilePathTreeItem.class.getResource( "/icons/folder.png" ).toExternalForm() );
	public static Image folderOpenImage = new Image(  
			FilePathTreeItem.class.getResource( "/icons/folder-open.png" ).toExternalForm() );
	public static Image fileImage = new Image(  
			FilePathTreeItem.class.getResource( "/icons/file.png" ).toExternalForm() );;
			
	private String fullyQualifiedPath = null;
	private boolean isDirectory = false;
	
	public FilePathTreeItem( Path path ) {
		super( path.toString() );
		fullyQualifiedPath = path.toString();
		
		if( Files.isDirectory( path ) ) {
			isDirectory = true;
			this.setGraphic( new ImageView( folderImage ) );
		}	
		else {
			this.setGraphic( new ImageView( fileImage ) );
		}
		
		this.setValue( path.toFile().getName() );
	}
	
}
