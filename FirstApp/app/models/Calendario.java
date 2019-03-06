package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Calendario extends Model {
    int temporada;


    public Calendario(){}
}
