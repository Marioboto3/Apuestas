package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Usuario extends Model {
    String Nombre;
    String Apellido;
    String Correo;
    int Edad;
    int id;
    double saldo;

    @OneToMany
    public List<Apuesta> apuestas = new ArrayList<Apuesta>();

    public Usuario(){
    }
}
