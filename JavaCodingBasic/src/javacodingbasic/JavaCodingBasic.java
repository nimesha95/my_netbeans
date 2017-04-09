package javacodingbasic;

import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaCodingBasic {
    
    Button button=new Button();
    
    public static void main(String[] args) {
        
     launch(args);  
    }

   // @Override
    public void start(Stage primaryStage) throws Exception{
    
        button.setText("Click here");
        button.setOnAction(e->alert.display("ab", "Hi"));
        StackPane stackpane= new StackPane();
        stackpane.getChildren().add(button);
        Scene scene=new Scene(stackpane,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

}

  


            
    
    
   
    
