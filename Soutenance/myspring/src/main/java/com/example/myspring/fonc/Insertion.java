package com.example.myspring.fonc;

import com.example.myspring.conn.Connexion;

import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Insertion {
    public static void InsertionRapportActivite(int idtechnicien, int idindicateuractivite, String quantiteeffectue, String datedebut, String datefin, String verificationlink){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "insert into rapportindicateuractivite(idtechnicien,idindicateuractivite,quantiteeffectue,datedebut,datefin,verificationlink) values ("+idtechnicien+","+idindicateuractivite+","+Double.parseDouble(quantiteeffectue)+",'"+sdf.parse(datedebut)+"','"+sdf.parse(datefin)+"','"+verificationlink+"')";
            Connection connection = Connexion.getConn();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate((sql));
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void InsertionRapportSousActivite(int idtechnicien, int idindicateursousactivite, String quantiteeffectue, String datedebut, String datefin, String verificationlink){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "insert into rapportindicateursousactivite(idtechnicien,idindicateursousactivite,quantiteeffectue,datedebut,datefin,verificationlink) values ("+idtechnicien+","+idindicateursousactivite+","+Double.parseDouble(quantiteeffectue)+",'"+sdf.parse(datedebut)+"','"+sdf.parse(datefin)+"','"+verificationlink+"')";
            Connection connection = Connexion.getConn();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate((sql));
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    // MOUVEMENT VEHICULE

    public static void InsertionMouvementVehicule(int idprojet, int idvehicule, int idtechnicien, int idsitedepart, int idsitearrivee, String datedebut, String datefin){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            String sql = "insert into mouvementvehicule(idprojet,idvehicule,idtechnicien,idsitedepart,idsitearrivee,datedebut,datefin) values ("+idprojet+","+idvehicule+","+idtechnicien+","+idsitedepart+","+idsitearrivee+",'"+sdf.parse(datedebut)+"','"+sdf.parse(datefin)+"')";
            Connection connection = Connexion.getConn();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate((sql));
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
