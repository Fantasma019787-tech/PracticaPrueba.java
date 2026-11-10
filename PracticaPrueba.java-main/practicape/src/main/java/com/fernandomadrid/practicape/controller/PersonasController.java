package com.fernandomadrid.practicape.controller;

import com.fernandomadrid.practicape.dto.PersonasDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    public TextField txtNombres;
    @FXML
    public TextField txtEdad;


    @FXML
    private TableView <PersonasDto> tblTabla;
    @FXML private TableColumn <PersonasDto, String> colNombre;
    @FXML private TableColumn <PersonasDto, Integer> ColEdad;
    @FXML
    private final ObservableList<PersonasDto> personas= FXCollections.observableArrayList();



    @FXML
    protected void onEliminarButtonClick() {
        welcomeText.setText("eliminado");
    }

    @FXML
    public  void onAnadirButtonClick() {

        PersonasDto persona;
        persona = new PersonasDto (txtNombres.getText(), Integer.parseInt(txtEdad.getText()));
        personas.add(persona);
    }

    @FXML
    public void onModificarButtonClick() {welcomeText.setText("Modificar persona");}

}

