package com.upb.registro_estudiante;

public class Estudiante {
    private string id;
    private string nombre;
    private string carrera;
    
    public Estudiante() {}

    public Estudiante(String id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    
}
