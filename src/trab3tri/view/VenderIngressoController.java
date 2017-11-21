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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import trab3tri.model.Cliente;
import trab3tri.model.Dados;
import trab3tri.model.Festa;
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
    private RadioButton masculino;
    
    @FXML
    private RadioButton feminino;
    
    @FXML
    private Label codigoIngresso;
    
    @FXML
    private ComboBox festa;
    
    Cliente c = new Cliente();
    Ingresso i = new Ingresso();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        codigoIngresso.setText(Integer.toString(i.gerarCodigo()));
        this.mostraFestas();
    }    
    
    @FXML
    private void voltarTela(){
        Helper.trocaTela("menu.fxml",null);     
    }
    
    public void venderIngresso(){
        Cliente c = new Cliente();
        Ingresso i = new Ingresso();
        Festa f = new Festa();
        c.setNome(nomeCliente.getText());
        c.setEmail(emailCliente.getText());
        if(masculino.isDisabled()==true){
            c.setSexo("Feminino");
        }
        else{
            c.setSexo("Masculino");
        }
        //f.setnomeDeFesta(festa.getSelectedItem());
        //i.setCodIngresso(String.(codigoIngresso.getText()));
        for(Cliente c2 : Dados.clientes){
            if(c2.equals(c.getEmail())){
                c2.comprarIngresso(i);
                f.addIngresso(i);
            }
            else{
                Dados.clientes.add(c);
                c.comprarIngresso(i);
                f.addIngresso(i);
            }
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
    
}
