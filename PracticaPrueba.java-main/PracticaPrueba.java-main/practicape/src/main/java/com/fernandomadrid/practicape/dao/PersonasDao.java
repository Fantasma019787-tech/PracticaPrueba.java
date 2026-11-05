package com.fernandomadrid.practicape.dao;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.fernandomadrid.practicape.gson.GsonBuilder;
import com.fernandomadrid.practicape.gson.TypeToken;
import com.fernandomadrid.practicape.gson.Personas;

public class PersonasDao {
    private String NOMBRE_ARCHIVO = "personas.json";
    private Path archivo;
    private Gson gson;

}
