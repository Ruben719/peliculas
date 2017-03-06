/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author 1061786305
 */
public class AppMain {
    
    
   public static void main (String[] args){
        
        System.out.print("Do something...");
        
        EntityManagerFactory emf;
        EntityManager em;
        
        
        
        emf= Persistence.createEntityManagerFactory("ejemploPU");
        em= emf.createEntityManager();
        
        Genero accion = new Genero ("accion","Peliculas de accion");  
        EntityTransaction tx = em.getTransaction();        
        tx.begin();
        em.persist(accion);//guardo en la bd
        tx.commit();  
        
        //se crea objeto en memoria (sin persistir aun).
        Persona guillermoDelToro = new Persona(    
        "Guillermo del Toro",
                "MX", 
                "12-11-75" ); 
        
        tx.begin();
        em.persist(guillermoDelToro);//se persiste objeto en bd
        tx.commit(); 
        
        
        Persona alexDeLaIglesia = new Persona("alexDeLaIglesia",
        "Española",
        "11-2-30");
        
       tx.begin();
       em.persist(alexDeLaIglesia);
       tx.commit();
   
        Genero romance = new Genero("Romance", "Peliculas de Romance");
        
   }
}
   


       /*
        Pelicula laberintoDelFauno 
                = new Pelicula("laberinto del fauno",1995, guillermoDelToro);
               
        tx.begin();
        em.persist(laberintoDelFauno);//guardo en la bd
        tx.commit(); 
        */
        //se crea objeto en memoria (sin persistir aun).
       
 /*System.out.print("Do something...");
Pelicula insideOut = new Pelicula("Inside Out");
insideOut.setAnio(2015);
        Persona d1= new Persona("JJ","Colombia","23-02-2013");
                insideOut.setDirector(d1);*/
