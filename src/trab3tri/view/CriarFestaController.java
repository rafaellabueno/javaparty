/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import trab3tri.model.Helper;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class CriarFestaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    private void voltarTela(){
        Helper.trocaTela("menu.fxml",null);     
    }
    
    @FXML
    private void criarFesta(){
        // 
    }
    
}