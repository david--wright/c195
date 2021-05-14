package dev.davidwright.appointmentmanager.controllers;

import java.io.IOException;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;



public class Login extends VBox {
    @FXML private TextField textField;
    @FXML private TitledPane loginBox;
    public Login() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "login.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }

    public StringProperty textProperty() {
        return textField.textProperty();
    }

    @FXML
    protected void login(ActionEvent event) {
        loginBox.setVisible(false);
    }
}
