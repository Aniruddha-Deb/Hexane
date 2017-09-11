package com.hexane.main.ui.controller.fileviewer;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

import javafx.event.Event;
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
	private Path path = null;
	private boolean directory = false;
	
	public FilePathTreeItem( Path path ) {
		super( path.toString() );
		this.path = path;
		fullyQualifiedPath = path.toString();
		
		if( Files.isDirectory( path ) ) {
			directory = true;
			this.setGraphic( new ImageView( folderImage ) );
		}	
		else {
			this.setGraphic( new ImageView( fileImage ) );
		}
		
		this.setValue( path.toFile().getName() );
	    this.addEventHandler( TreeItem.branchExpandedEvent(), 
    					  	(e) -> handleBranchExpandedEvent( e ));
	    this.addEventHandler( TreeItem.branchCollapsedEvent(), 
    						(e) -> handleBranchCollapsedEvent( e ));
	}
	
	private void handleBranchExpandedEvent( Event e ) {
		
        FilePathTreeItem source=(FilePathTreeItem)e.getSource();
        
        if(source.isDirectory()&&source.isExpanded()){
          ImageView iv=(ImageView)source.getGraphic();
          iv.setImage( folderOpenImage );
        }
        try{
          if(source.getChildren().isEmpty()){
            Path path=Paths.get(source.getFullyQualifiedPath());
            BasicFileAttributes attribs=Files.readAttributes(path,BasicFileAttributes.class);
            if(attribs.isDirectory()){
              DirectoryStream<Path> dir=Files.newDirectoryStream(path);
              for(Path file:dir){
                FilePathTreeItem treeNode=new FilePathTreeItem(file);
                source.getChildren().add(treeNode);
              }
            }
          }else{
            //if you want to implement rescanning a directory for changes this would be the place to do it
          }
        }catch(IOException x){
          x.printStackTrace();
        }
	}
	
	private void handleBranchCollapsedEvent( Event e ) {
		FilePathTreeItem source=(FilePathTreeItem)e.getSource();
        if(source.isDirectory()&&!source.isExpanded()){
          ImageView iv=(ImageView)source.getGraphic();
          iv.setImage( folderImage );
        }
	}
	
	public FilePathTreeItem addSubpathsAsChildren( FilePathTreeItem fpti ) {
		if( !( Files.isDirectory( fpti.path ) ) ) {
			return new FilePathTreeItem( fpti.path );
		}
		
		try( DirectoryStream<Path> directoryStream = 
				Files.newDirectoryStream( fpti.path ) ) {
			directoryStream.forEach( (t) -> {
				FilePathTreeItem subFile = addSubpathsAsChildren( 
						new FilePathTreeItem( t ) );
				fpti.getChildren().add( subFile );						
			});
		}
		catch( IOException ex ) {
			ex.printStackTrace();
		}
		return fpti;
	}
	
	public String getFullyQualifiedPath(){
		return fullyQualifiedPath;
	}
	
	public boolean isDirectory(){
		return directory;
	}
}
