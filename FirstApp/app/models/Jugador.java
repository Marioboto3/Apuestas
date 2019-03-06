package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Jugador extends Model{
    String Nombre;
    int Edad;
    String País;

    public Jugador (String name, int age, String country)
    {
        this.Nombre=name;
        this.Edad=age;
        this.País=country;
    }

}
