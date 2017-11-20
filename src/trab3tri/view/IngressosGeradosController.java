/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import trab3tri.model.Cliente;
import trab3tri.model.Festa;
import trab3tri.model.Helper;
import trab3tri.model.Ingresso;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class IngressosGeradosController implements Initializable {

    @FXML
    private TableColumn<Ingresso, String> conteudoColumn;
     @FXML
    private TableColumn<Festa, String> conteudoColumn2;
    
    @FXML
    private javafx.scene.control.Button fecharTela;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // conteudoColumn.setCellValueFactory(dados -> new SimpleStringProperty(dados.getValue().));
       //conteudoColumn.setCellValueFactory(dados -> new SimpleStringProperty(dados.getValue().getClass()));
        
        
        Cliente c = new Cliente();
        c.setEmail("rafaellasbueno@gmail.com");
        c.setNome("Rafaella Santana Bueno");
        c.setSexo("Feminino");

        Ingresso i = new Ingresso();
        i.gerarCodigo();

        c.comprarIngresso(i);
    }

    @FXML
    private void voltaTela() {
        Stage stage = (Stage) fecharTela.getScene().getWindow(); //Obtendo a janela atual
        stage.close(); //Fechando o Stage
    }
}
