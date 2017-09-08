package com.hexane.main.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.ToolBar;
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
	
	private Stage primaryStage = null;
	
	public Controller( Stage primaryStage ) {
		this.primaryStage = primaryStage;
	}

	@FXML
	public void initialize() {
		statusLabel.setText( "Succesfully created controller" );
	}
}
