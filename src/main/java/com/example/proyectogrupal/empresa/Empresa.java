package com.example.proyectogrupal.empresa;

import com.example.proyectogrupal.alumno.Alumno;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "empresas")
public class Empresa implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Email")
    private String email;

    @Column(name = "Telefono")
    private Integer telefono;

    @Column(name = "Responsable")
    private String responsable;

    @Column(name = "Observaciones")
    private String observaciones;

    @OneToMany(mappedBy = "Alumno" , fetch = FetchType.EAGER)
    private List<Alumno> alumnos = new ArrayList<>();

}
