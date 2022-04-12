/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scd.myspa.gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

public class LoginController implements Initializable{

    @FXML
    private JFXTextField txtUsuario;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private JFXButton btnIngresar;

    @FXML
    private JFXButton btnSalir;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    
    public void validarUsuario(){
        String user = txtUsuario.getText();
        String pass = txtUsuario.getText();
        
        System.out.println("Usuario: " +user);
        System.out.println("Password: " +pass);
        
        
        if("admin".equals(user)&& "1234".equals(pass)){
            
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING,"Datos Incorrectos. Intentar de nuevo.");
            alert.show();
        }
    }
}
