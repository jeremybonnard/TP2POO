/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2poo;

/**
 *
 * @author Plouf
 */
public class Livre extends Article{
    protected int numISBN;
    protected int nbrPage;
    protected String auteur;
    // constructeur par défaut
    public Livre(){
        super();
        this.numISBN= 0;
        this.nbrPage = 0;
        this.auteur ="Inconnu";                   
    }
    //Constructeur complet
    public Livre(int reference, String designation, double prix, int numISBN, int nbrPage, String auteur){
        super(reference, designation, prix);
        this.numISBN = numISBN;
        this.nbrPage = nbrPage;
        this.auteur = auteur;        
    }
    //Getters et Setter
    public int getNumISBN(){
        return this.numISBN;
    }
    public int getNbrPage(){
        return this.nbrPage;        
    }
    public String getAuteur(){
        return this.auteur;
    }
    public void setNumISBN(int numISBN){
        this.numISBN= numISBN;
    }
    public void setNbrPage(int nbrPage){        
        this.nbrPage = nbrPage;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    //Fonction toString
    public String toString(){
        return getReference()+" "+getDesignation()+" "+getPrix()+" "+getNumISBN()+" "+getNbrPage()+" "+getAuteur();
    }       
}
