/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import com.gitlab.rafaellabueno.model.Cliente;
import com.gitlab.rafaellabueno.model.Festa;
import com.gitlab.rafaellabueno.controller.HelperUtil;
import com.gitlab.rafaellabueno.model.Dados;
import com.gitlab.rafaellabueno.model.Ingresso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class PontosPorEmailController implements Initializable {
    
    
    @FXML
    private TableColumn<Cliente, String> conteudoColumn;
     @FXML
    private TableColumn<Cliente, String> conteudoColumn2;
     @FXML 
     private TableView tabela;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Cliente> lista = FXCollections.observableArrayList();
        lista.addAll(Dados.clientes); 
        
        conteudoColumn.setCellValueFactory(dados -> new SimpleStringProperty(dados.getValue().getEmail()));
        conteudoColumn2.setCellValueFactory(dados -> new SimpleStringProperty(Integer.toString(dados.getValue().getPontos())));
        tabela.setItems(lista);
    }  
  
    @FXML
    private void voltaTela(){
        HelperUtil.trocaTela("menu.fxml",null);     
    }
    
}
