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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import trab3tri.model.Cliente;
import trab3tri.model.Helper;
import trab3tri.model.Ingresso;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class VenderIngressoController implements Initializable {

    @FXML
    private TextField nomeCliente;
    
    @FXML
    private TextField emailCliente;
    
    @FXML
    private TextField sexoCliente;
    
    @FXML
    private Label codigoIngresso;
    
    Cliente c = new Cliente();
    Ingresso i = new Ingresso();
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
    
}
