package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Liga extends Model{


    String país;

    public Liga (){ }

}