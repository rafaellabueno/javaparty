/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.view;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.gitlab.rafaellabueno.controller.ArquivinhosUtil;
import com.gitlab.rafaellabueno.controller.HelperUtil;
import com.gitlab.rafaellabueno.model.Dados;
import com.gitlab.rafaellabueno.model.Festa;
//import trab3tri.model.HelperUtil;

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
    private void criarFestaTela(){
        HelperUtil.trocaTela("criar_festa.fxml",null);     
    }
    
    @FXML
    private void pontosTela(){
        HelperUtil.trocaTela("pontos_por_email.fxml",null);     
    }
    
    @FXML
    private void ingressosGeradosTela(){
        HelperUtil.trocaTela("ingressos_gerados.fxml",null);     
    }
    
    @FXML
    private void venderIngressoTela(){
        List<Festa> f = ArquivinhosUtil.CarregaFesta();
        Dados.festas=f;
        for(Festa f2 : f){
            System.out.println(f2.getnomeDeFesta());
        }
        HelperUtil.trocaTela("vender_ingresso.fxml",null);     
    }
    
}
