/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2poo;
import java.util.ArrayList; 
/**
 *
 * @author Plouf
 */
public class Livre extends Article{
    protected int numISBN;
    protected int nbrPage;
    protected ArrayList<Auteur> aEteEcrit;
    
    //Constructeur complet
    public Livre(int reference, String designation, double prix, int numISBN, int nbrPage,Auteur unAuteur){
        super(reference, designation, prix);
        this.numISBN = numISBN;
        this.nbrPage = nbrPage;
        this.aEteEcrit = new ArrayList<Auteur>();
        this.aEteEcrit.add(unAuteur);
    }
      public Livre(int reference, String designation, double prix, int numISBN, int nbrPage,ArrayList<Auteur> lesAuteur){
        super(reference, designation, prix);
        this.numISBN = numISBN;
        this.nbrPage = nbrPage;
        this.aEteEcrit = new ArrayList<Auteur>();
        for(Auteur unAuteur : lesAuteur){
          this.aEteEcrit.add(unAuteur);    
        }
      
    }
    //Getters et Setter
    public int getNumISBN(){
        return this.numISBN;
    }
    public int getNbrPage(){
        return this.nbrPage;        
    }    
    public void setNumISBN(int numISBN){
        this.numISBN= numISBN;
    }
    public void setNbrPage(int nbrPage){        
        this.nbrPage = nbrPage;
    }
    public ArrayList<Auteur> getAuteur(){
        return this.aEteEcrit;
    }
    public Auteur getUnAuteur(int place){
        if(place < this.aEteEcrit.size()){
            return this.aEteEcrit.get(place);
        }
        else{
        return null;
        }
    }

    
    //Fonction toString
    public String toString(){
        for(Auteur unAuteur : aEteEcrit){
            
        }
        return getReference()+" "+getDesignation()+" "+getPrix()+" "+getNumISBN()+" "+getNbrPage();
    }       
}
