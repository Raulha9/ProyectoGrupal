package com.example.proyectogrupal.profesor;

import com.example.proyectogrupal.alumno.Alumno;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "profesor")
public class Profesor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Profesor;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellidos")
    private String apellidos;

    @Column(name = "Contrasenya")
    private String contrasenya;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "tutor", fetch = FetchType.EAGER)
    private List<Alumno> alumnos = new ArrayList<>();

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + ID_Profesor +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", email='" + email + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
