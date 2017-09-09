package com.hexane.main;

import com.hexane.main.ui.components.mainMenu.MainMenuBar;
import com.hexane.main.ui.controller.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
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
		 
		Scene scene = setupScene( rootLayout, controller );
		
		primaryStage.setScene( scene );
		primaryStage.setTitle( "Hello Hexane" );
		primaryStage.show();
	}
	
	private Scene setupScene( Pane r, Controller c ) {		
		MainMenuBar menuBar = new MainMenuBar( c );
		
		if( System.getProperty( "os.name", "UNKNOWN" ).startsWith( "Mac" ) ) {
			menuBar.setUseSystemMenuBar( true );
		}
		
		BorderPane root = new BorderPane();
		root.setTop( menuBar );
		root.setCenter( r );
		return new Scene( root );
	}
}
