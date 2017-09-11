package com.hexane.main.ui.controller.fileviewer;

import java.io.File;
import java.nio.file.Paths;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class FileViewer {
	
	private TreeView<String> treeView = null;
	private TreeItem<String> root = null;
	
	public FileViewer( TreeView<String> treeView ) {
		this.treeView = treeView;
		root = new TreeItem<String>();
		this.treeView.setRoot( root );
		this.treeView.setShowRoot( false );
	}
	
	public void displayFile( File file ) {
		FilePathTreeItem f = new FilePathTreeItem( Paths.get( file.toURI() ) );
		f.setExpanded( true );
		root.getChildren().add( 0, f );		
	}
			
	public void displayDirectory( File directory ) {
		FilePathTreeItem f = new FilePathTreeItem( Paths.get( directory.toURI() ) );
		f = f.addSubpathsAsChildren( f );
		f.setExpanded( true );
		root.getChildren().add( f );
	}
}
