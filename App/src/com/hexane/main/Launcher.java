package com.hexane.main;

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
        AnchorPane rootLayout = (AnchorPane)FXMLLoader.load( getClass().getResource( "ui/view/MainView.fxml" ) );
		Scene s = new Scene( rootLayout );
		primaryStage.setScene( s );
		primaryStage.setTitle( "Hello Hexane" );
		primaryStage.show();
	}
}
