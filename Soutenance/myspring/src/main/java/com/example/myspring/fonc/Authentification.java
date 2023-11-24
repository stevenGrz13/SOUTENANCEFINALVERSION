package com.example.myspring.fonc;

import com.example.myspring.conn.Connexion;
import com.example.myspring.entities.UsefulEntity;
import com.example.myspring.modeles.Technicien;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Objects;

public class Authentification {
    public static UsefulEntity loginTechnicien(String nom, String pass) throws Exception{
        UsefulEntity res = new UsefulEntity();
        res.setEtat(false);
        ArrayList<Technicien> liste = Fonction.listeTechnicien();
        for(int i=0; i<liste.size(); i++){
            if((Objects.equals(liste.get(i).getEmail(), nom))&&(Objects.equals(liste.get(i).getPass(), pass))){
                res.setEtat(true);
                res.setIdTechnicien(liste.get(i).getId());
            }
        }
        return res;
    }
}
