/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcv;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import model.User;

/**
 *
 * @author tmtrd
 */
public class QLCV extends Application {
    
    private Stage stage;
    private User loggedUser;
    private final double MINIMUM_WINDOW_WIDTH = 390.0;
    private final double MINIMUM_WINDOW_HEIGHT = 500.0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(QLCV.class, (java.lang.String[])null);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            stage.setTitle("Đăng nhập");
            stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
            stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
            gotoLogin();
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(QLCV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User getLoggedUser() {
        return loggedUser;
    }
    
    public boolean userLogging(String userId, String password){
        if (Authenticator.validate(userId, password)) {
            loggedUser = User.of(userId);
            gotoProfile();
            return true;
        } else {
            return false;
        }
    }
    
    private void createScene() {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        fxContainer.setScene(new Scene(root));
    }
    
}
