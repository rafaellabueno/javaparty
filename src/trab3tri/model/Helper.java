/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.model;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import static trab3tri.view.Main.ps;
import trab3tri.view.MenuController;



/**
 *
 * @author Rafaella Bueno
 */
public class Helper {
    
    public static Scene trocaTela(String str, String titulo){
        Scene scene = null; //Ela começa nula
        try {
            FXMLLoader loader = new FXMLLoader(); 
            loader.setLocation(MenuController.class.getResource(str));
            AnchorPane layout = (AnchorPane) loader.load();

            scene = new Scene(layout);
        } catch (IOException e) {
            System.out.println("Exception de fxml");
            e.printStackTrace();
        }
        ps.setScene(scene);
        if(titulo != null){
            ps.setTitle(titulo);
        }
        ps.show();
        return scene; 
    }
}
