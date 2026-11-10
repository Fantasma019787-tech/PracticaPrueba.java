package com.fernandomadrid.practicape.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PersonasController {

    @FXML
    public Button Eliminar;
    @FXML
    public Button Añadir;
    @FXML
    public Button Modificar;
    @FXML
    private Label welcomeText;




    @FXML
    protected void onEliminarButtonClick() {
        welcomeText.setText("eliminado");
    }

    @FXML
    public  void onAnadirButtonClick() {welcomeText.setText("Añadir persona");}

    @FXML
    public void onModificarButtonClick() {welcomeText.setText("Modificar persona");}
}
