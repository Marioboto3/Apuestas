package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Jornada extends Model {

    int numero;

    public Jornada(){}
}
