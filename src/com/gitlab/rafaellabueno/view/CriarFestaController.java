/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import com.gitlab.rafaellabueno.controller.ArquivinhosUtil;
import com.gitlab.rafaellabueno.model.Dados;
import com.gitlab.rafaellabueno.model.Festa;
import com.gitlab.rafaellabueno.controller.HelperUtil;

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
    private TextArea descricao;
    
    @FXML
    private TextField data;
    
    @FXML
    private TextField qtd;
    
    @FXML
    private TextField valor;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    } 
    
    @FXML
    private void voltarTela(){
        HelperUtil.trocaTela("menu.fxml",null);     
    }
    
    @FXML
    private void criarFesta(){
        // 
        Festa f = new Festa();
        f.setnomeDeFesta(nome.getText());
        f.setTipoDeFesta(tipo.getText());
        f.setDescricao(descricao.getText());
        f.setData(data.getText());
        f.setValor(Integer.parseInt(valor.getText()));
        f.setQtdIng(Integer.parseInt(qtd.getText())); 
        Dados.festas.add(f);
        
        ArquivinhosUtil.SalvaFesta(Dados.festas);
        
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Sua festa foi criada com sucesso!");
        alert.showAndWait();
    }
    
}
