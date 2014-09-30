/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2poo;
import java.util.Date;
import java.util.ArrayList;        
/**
 *
 * @author Plouf
 */
public class Personne {
    protected String nom;
    protected String prenom;
    protected Date dateDeNaissance;
    
    //constructeur par défaut
    public Personne(){
        super();                
    }
    public Personne(String nom, String prenom, Date dateDeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    public String toString(){
        return getNom()+" "+getPrenom()+" "+getDateDeNaissance()+" ";
    }   
    
}
