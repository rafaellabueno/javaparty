/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.view;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import trab3tri.model.Helper;
//import trab3tri.model.Helper;

/**
 * FXML Controller class
 *
 * @author Rafaella Bueno
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    private void blocoTela(){
        Helper.trocaTela("bloco.fxml",null);     
    }
    
    @FXML
    private void halloweenTela(){
        Helper.trocaTela("halloween.fxml",null);     
    }
    
    @FXML
    private void octoberTela(){
        Helper.trocaTela("octoberFest.fxml",null);     
    }
    
    @FXML
    private void pagodaoTela(){
        Helper.trocaTela("pagodao.fxml",null);     
    }
    
}
