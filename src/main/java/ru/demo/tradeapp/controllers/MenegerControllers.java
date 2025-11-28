package ru.demo.tradeapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import ru.demo.tradeapp.util.Manager;

import static javax.swing.JOptionPane.showMessageDialog;

public class MenegerControllers {

    @FXML
    private Button btnNajat;

    @FXML
    void btnNajatOnAction(ActionEvent event) {
        showMessageDialog(null,"Добрый день," + Manager.currentUser.getFirstName());
    }

}
