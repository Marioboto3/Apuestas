package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Apuesta extends Model {

    double importe;
    String pronostico;

    @ManyToOne
    public Usuario usuario;

    @ManyToOne
    public Partido partido;

    public Apuesta(){}
}
