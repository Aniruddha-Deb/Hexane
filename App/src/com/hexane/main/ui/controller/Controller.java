package com.hexane.main.ui.controller;

import java.io.File;

import com.hexane.main.ui.controller.fileviewer.FileViewer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller{	
	
	@FXML
	public ProgressBar progressBar;
	@FXML
	public Label statusLabel;
	@FXML
	public Label infoLabel;
	@FXML
	public Slider zoomSlider;
	@FXML
	public Label zoomLabel;
	@FXML
	public ToolBar toolbar;
	@FXML
	public MenuBar menuBar;	
	@FXML
	public TreeView<String> fileView;
	
	private Stage primaryStage = null;
	private FileChooser fileChooser = null;
	private DirectoryChooser directoryChooser = null;
	
	private FileViewer fileViewer = null;
	
	public Controller( Stage primaryStage ) {
		this.primaryStage = primaryStage;
		fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().add( 
			new FileChooser.ExtensionFilter( "Hexane Files (.hxf)", "*.hxf" ) );
		directoryChooser = new DirectoryChooser();		
	}

	@FXML
	public void initialize() {
		statusLabel.setText( "Succesfully created controller" );
		zoomLabel.setText( "100%" );
		infoLabel.setText( "Open a file to get started" );		
		progressBar.setProgress( 0.2 );
		
		fileViewer = new FileViewer( fileView );
		
		if( System.getProperty( "os.name", "UNKNOWN" ).startsWith( "Mac" ) ) {
			menuBar.setUseSystemMenuBar( true );
		}
	}
	
	@FXML
	public void openFile( ActionEvent e ) {
		File file = fileChooser.showOpenDialog( primaryStage );
		if( file != null ) {
			fileViewer.displayFile( file );
		}
	}	
	
	@FXML
	public void openFolder( ActionEvent e ) {
		File dir = directoryChooser.showDialog( primaryStage );
		if( dir != null ) {
			fileViewer.displayDirectory( dir );
		}
	}
	
	@FXML
	public void saveFile( ActionEvent e ) {
		fileChooser.showSaveDialog( primaryStage );
	}
}