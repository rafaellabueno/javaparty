/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.view;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 *
 * @author Aluno
 */
public class Main extends Application {
     
    private Stage primaryStage; 
    public static Stage ps;
    
    
    
    @Override
    public void start(Stage ps2) {
        this.primaryStage = ps2; 
        
     
        
        primaryStage.setTitle("Trablho");
        primaryStage.setScene(getRootLayout());
        primaryStage.show();
        
        ps = primaryStage;
    }
    
     public Scene getRootLayout() {   
                
        Scene scene = null;
        try {
            // Loader
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MenuController.class.getResource("menu.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            scene = new Scene(rootLayout);
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("oi");
        }
        return scene;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
