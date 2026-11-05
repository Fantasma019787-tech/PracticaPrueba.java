package com.fernandomadrid.practicape.dto;

public class PersonasDto {
    private String nombre;
    private Integer edad;

    public PersonasDto(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

//    @Override
  //  public String toString() {
    //    return "PersonaDto[edad=" + edad+ ", nombre=" + nombre"]";
    //}
}
