/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcv;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author tmtrd
 */
public class LoginController extends AnchorPane implements Initializable{
    
    @FXML
    TextField userId;
    @FXML
    PasswordField password;
    @FXML
    Button login;
    @FXML
    Label errorMessage;
    
    private QLCV application;

    public void setApplication(QLCV application) {
        this.application = application;
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errorMessage.setText("");
        userId.setPromptText("Tên đăng nhập");   
        password.setPromptText("Mật khẩu");
    }

//  Xử lý sự kiện nút Login
//  Mình muốn chỉnh sửa trên giao diện GUI thì làm thế nào?    
//    public void processLogin(ActionEvent event) {
//        if (application == null){
//            // We are running in isolated FXML, possibly in Scene Builder.
//            // NO-OP.
//            errorMessage.setText("Hello " + userId.getText());
//        } else {
//            if (!application.userLogging(userId.getText(), password.getText())){
//                errorMessage.setText("Sai tên đăng nhập hoặc mật khẩu");
//            }
//        }
//    }
}
