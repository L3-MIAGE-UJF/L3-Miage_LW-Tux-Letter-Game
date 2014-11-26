/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;

import java.util.ArrayList;

/**
 *
 * @author Bzah
 */
public class Profile {

    private String nom;
    private String dateNaissance;
    private int avatar;
    private ArrayList<Partie> parties;

    public Profile(String nom, String dateNaissance) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.avatar = 1;

    }

    public Profile(String filename) {

    }

    public void ajouterPartie(Partie p) {
        parties.add(p);
    }

    public int getLastLevel() {
        return parties.get(parties.size() - 1).getNiveau();
    }

    public String toString() {
        return parties.size() + " parties pour ce profil";
    }

    public void save(String filename) {

    }

    private String xmlDateToProfileDate(String xmlDate) {
        String date;
        // récupérer le jour
        date = xmlDate.substring(xmlDate.lastIndexOf("-") + 1, xmlDate.length());
        date += "/";
        // récupérer le mois
        date += xmlDate.substring(xmlDate.indexOf("-") + 1, xmlDate.lastIndexOf("-"));
        date += "/";
        // récupérer l'année
        date += xmlDate.substring(0, xmlDate.indexOf("-"));

        return date;
    }

    private String profileDateToXmlDate(String profileDate) {

        String date;
        // Récupérer l'année
        date = profileDate.substring(profileDate.lastIndexOf("/") + 1, profileDate.length());
        date += "-";
        // Récupérer  le mois
        date += profileDate.substring(profileDate.indexOf("/") + 1, profileDate.lastIndexOf("/"));
        date += "-";
        // Récupérer le jour
        date += profileDate.substring(0, profileDate.indexOf("/"));

        return date;
    }

}
