package com.hexane.main.ui.controller.fileviewer;

import javafx.scene.control.TreeView;

public class FileRenderer {

	private TreeView<FilePathTreeItem> treeView = null;
	
	public FileRenderer( TreeView<FilePathTreeItem> treeView ) {
		this.treeView = treeView;
		setupTreeView();
	}
	
	private void setupTreeView() {
		
	}
}
