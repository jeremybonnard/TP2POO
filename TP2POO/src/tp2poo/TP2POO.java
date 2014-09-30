/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2poo;
import java.time.Duration;
/**
 *
 * @author Plouf
 */
public class TP2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*Exercice 1
    Article a1,a2;
    a1=new Article();
        a1.setReference(100);
        a1.setDesignation("La Programmation en java");
        a1.setPrix(20.5);
        
       a2=new Article(100,"Les méthodes d'agile",25.5);
       
        test(a1);
        System.out.println(a1.toString());
        
        test(a2);
        System.out.println(a2.toString());
        
    }
    public static void test(Article a){
        System.out.println("reference: "+a.getReference());
        System.out.println("designation :"+a.getDesignation());
        System.out.println("prix :"+a.getPrix()+" €");
    }
      //Exerice 1 fin */
      //Exercice 2
    Livre l;
    Dvd d;
    l = new Livre();
    l.setReference(100);
    l.setDesignation("Apprendre AnglarJs");
    l.setPrix(8.5);
    l.setNbrPage(86);
    l.setNumISBN(858585858);
    l.setAuteur("Hervé");
    testLivre(l);
    System.out.println(l.toString());
    
    
    d = new Dvd(100,"L'histoire de l'informatique",19.50,90,"Girault");
    testDvd(d);
    System.out.println(d.toString());
    }
    public static void testDvd(Dvd a){
       System.out.println("reference: "+a.getReference());
       System.out.println("designation :"+a.getDesignation());
       System.out.println("prix :"+a.getPrix()+" €");
       System.out.println("Durée :"+a.getDuree());
       System.out.println("Auteur :"+a.getRealisateur());
    }
    public static void testLivre(Livre a){
       System.out.println("reference: "+a.getReference());
       System.out.println("designation :"+a.getDesignation());
       System.out.println("prix :"+a.getPrix()+" €");
       System.out.println("Numero ISBN :"+a.getNumISBN());
       System.out.println("Nombre Page :"+a.getNbrPage());
       System.out.println("Auteur :"+a.getAuteur());
       
    }
    //Exercie 2 Fin
}
