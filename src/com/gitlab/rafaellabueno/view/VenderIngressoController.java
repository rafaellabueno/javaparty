/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.view;

import com.gitlab.rafaellabueno.controller.ArquivinhosUtil;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import com.gitlab.rafaellabueno.model.Cliente;
import com.gitlab.rafaellabueno.model.Dados;
import com.gitlab.rafaellabueno.model.Festa;
import com.gitlab.rafaellabueno.controller.HelperUtil;
import com.gitlab.rafaellabueno.model.Ingresso;

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
    private RadioButton masculino;

    @FXML
    private RadioButton feminino;

    @FXML
    private Label codigoIngresso;
    
    @FXML
    private Label data;
    
    @FXML
    private Label descricao;

    @FXML
    private ListView<Festa> festa;
    private ObservableList<Festa> obsFesta;

    Cliente c = new Cliente();
    Ingresso i = new Ingresso();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        obsFesta = festa.getItems();
        for (Festa fe : Dados.festas) {
            obsFesta.add(fe);
        }
        this.mostraFestas();

    }

    @FXML
    private void voltarTela() {
        HelperUtil.trocaTela("menu.fxml", null);
    }

    public void venderIngresso() {
        Cliente c = new Cliente();
        Ingresso i = new Ingresso();
        Festa f = festa.getSelectionModel().getSelectedItems().get(0);
        
        int r = f.geraCodigo();
        int t = r;
        if(t>f.getQtdIng()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Não há mais ingressos disponíveis!");
        alert.showAndWait();
            
        }
        else{
        c.setNome(nomeCliente.getText());
        c.setEmail(emailCliente.getText());
        
         System.out.println(c.getPontos());
          System.out.println(f.getPontos());
        c.setPontos(c,f);
       
        System.out.println(c.getPontos());
        
        System.out.println(c.getPontos());
        if (masculino.isSelected() == true) {
            c.setSexo("Masculino");
        }
        if (feminino.isSelected() == true) {
            c.setSexo("Feminino");
        }
        
       
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Seu ingresso foi vendido com sucesso!");
        alert.setContentText("O código do ingresso é: " + r);
        alert.showAndWait();
        i.setCodIngresso(r);
        
        boolean encontrou = false;
        for (Cliente c2 : Dados.clientes) {
            if (c2.getEmail().equals(c.getEmail())) {
                c2.comprarIngresso(i);
                encontrou = true;
                break;
            } 
        }
        if(!encontrou){
            c.comprarIngresso(i);
            Dados.clientes.add(c);
        }
        
        f.addIngresso(i);
        
        ArquivinhosUtil.SalvaFesta(Dados.festas);
        ArquivinhosUtil.SalvaCliente(Dados.clientes);
        }
    }

    private void mostraFestas() {
        festa.setCellFactory(param -> new ListCell<Festa>() {

            @Override
            public void updateItem(Festa f, boolean empty) {
                super.updateItem(f, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    setText(f.getnomeDeFesta());
                }

            }
        });
    }
    
    @FXML
    public void exibirEspecificacaoFesta() {
        Festa f = festa.getSelectionModel().getSelectedItems().get(0);
        descricao.setText(f.getDescricao());
        data.setText(f.getData());
    }

}
