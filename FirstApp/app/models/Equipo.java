package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Equipo extends Model {

    String entrenador;
    int puntos;
    int goles_favor;
    int goles_contra;

    public Equipo (){}
}
