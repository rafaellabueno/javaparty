/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import com.gitlab.rafaellabueno.controller.ArquivinhosUtil;
import com.gitlab.rafaellabueno.model.Festa;
import com.gitlab.rafaellabueno.controller.HelperUtil;
import com.gitlab.rafaellabueno.model.Dados;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class IngressosGeradosController implements Initializable {

    @FXML
    private TableColumn<Festa, String> conteudoColumn;
     @FXML
    private TableColumn<Festa, String> conteudoColumn2;
   
     @FXML 
     private TableView tabela;
     @FXML
    private javafx.scene.control.Button fecharTela;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        ObservableList<Festa> lista = FXCollections.observableArrayList();
        lista.addAll(Dados.festas);       
        
       conteudoColumn.setCellValueFactory(dados -> new SimpleStringProperty(Integer.toString(dados.getValue().getQtdIng())));
       conteudoColumn2.setCellValueFactory(dados -> new SimpleStringProperty(dados.getValue().getnomeDeFesta()));
       tabela.setItems(lista);

    }

    @FXML
    private void voltaTela(){
        HelperUtil.trocaTela("menu.fxml",null);     
    }
}
