package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Partido extends Model{

    String fecha;
    String hora;
    String estadio;
    String Equipo_local;
    String Equipo_visitante;
    double cuota_1;
    double cuota_X;
    double cuota_2;
    String resultado;

    @OneToMany
    public List<Apuesta> id_partido = new ArrayList<Apuesta>();

    public Partido(){}

}