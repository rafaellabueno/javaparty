/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.view;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import com.gitlab.rafaellabueno.controller.ArquivinhosUtil;
import com.gitlab.rafaellabueno.model.Dados;


/**
 *
 * @author Aluno
 */
public class Main extends Application {
     
    private Stage primaryStage; 
    public static Stage ps;
    
    
    
    @Override
    public void start(Stage ps2) {
        File f = new File("Festa.txt");
        File f2 = new File("Cliente.txt");
        if(f.exists()==true){
        Dados.festas = ArquivinhosUtil.CarregaFesta();        
        }
        if(f2.exists()==true){
            Dados.clientes = ArquivinhosUtil.CarregaCliente();
        }
        
        
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
