package com.hexane.main;

import com.hexane.main.ui.controller.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Launcher extends Application {

	public static void main( String[] args ){
		launch( args );
	}

	@Override
	public void start( Stage primaryStage ) throws Exception {
		
		Controller controller = new Controller( primaryStage );
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation( getClass().getResource( "/views/MainView.fxml" ) );
		loader.setController( controller );
		
		AnchorPane rootLayout = (AnchorPane)loader.load();
		 
		primaryStage.setScene( new Scene( rootLayout ) );
		primaryStage.setTitle( "Hello Hexane" );
		primaryStage.show();
	}	
}
