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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import trab3tri.model.Dados;
import trab3tri.model.Festa;
import trab3tri.model.Helper;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class CriarFestaController implements Initializable {

    @FXML
    private TextField nome;
    
    @FXML
    private TextField tipo;
    
    @FXML
    private TextField descricao;
    
    @FXML
    private TextField data;
    
    @FXML
    private TextField qtd;
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
        Festa f = new Festa();
        f.setnomeDeFesta(nome.getText());
        f.setTipoDeFesta(tipo.getText());
        f.setDescricao(descricao.getText());
        f.setData(data.getText());
        f.setQtdIng(qtd.getText()); 
        Dados.festas.add(f);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Sua festa foi criada com sucesso!");
        alert.showAndWait();
    }
    
}
