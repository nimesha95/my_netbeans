/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodingbasic;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Nimesha
 */
public class alert {
    
    public static void display(String title,String message)
    {
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        
        stage.setTitle("Alert Box");
        stage.setMinWidth(300);
        
        Label label=new Label();
        label.setText(message);
        
        Button button=new Button("Click to close");
        button.setOnAction(e->stage.close());
        
        VBox vbox=new VBox();
        vbox.getChildren().addAll(label,button);
        vbox.setAlignment(Pos.CENTER_RIGHT);
        
        Scene scene=new Scene(vbox);
        stage.setScene(scene);
        stage.showAndWait();
        
        
        
        
    }
    
}
