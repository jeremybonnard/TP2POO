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
public class Auteur extends Personne{
 private ArrayList<Livre> aEcrit;
 public Auteur(){
     super();
     this.aEcrit = new ArrayList<Livre>();
 }
  public Auteur(Livre unLivre){
     super();
     this.aEcrit = new ArrayList<Livre>();
     this.aEcrit.add(unLivre);
 }
   public Auteur(ArrayList<Livre> lesLivres ){
     super();
     this.aEcrit = new ArrayList<Livre>();
     for(Livre unLivre : lesLivres){
         this.aEcrit.add(unLivre);         
     }         
 }  
}
