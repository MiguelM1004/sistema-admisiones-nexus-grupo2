package com.grupo2.nexus.model.embeddable;
import jakarta.persistence.Embeddable;

@Embeddable

public class DatosPersonales {
    private String nombre;
    private String email;
    private String contrasena;

}
