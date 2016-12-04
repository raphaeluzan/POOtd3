/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td2poo;

import static td2poo.Point.memeReel;

/**
 *
 * @author Utilisateur
 */
public class TD2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//______________________( 1 )___________________________________________________        
    Point x = new Point(3,8);    
    System.out.println(x);
    Point y = new Point(3,5);
    System.out.println(y);    
    System.out.println(x.distance(y)); 
//    
//    System.out.println(memeReel(5,5.00000001));
//    System.out.println(memeReel(5,5.00000000001));   
//    
//    Point w = new Point(3,5.00000000000001);   
//    
//    System.out.println(x.equals(y));
//    System.out.println(x.equals(w));   
//    System.out.println(y.equals(w));  
//    System.out.println(x);
//    System.out.println(y);
//    System.out.println(w);    
//
//______________________( 2 )___________________________________________________
    Point x1 = new Point(0,1);
    Point y1 = new Point(1,1);
    Point w1 = new Point(1,0);    
    
    Polygone p1 = new Polygone(x1,y1);    
    Polygone p2 = new Polygone(x1,y1,w1);   
    Point pol1[] = {new Point(0,1),new Point(1,1),new Point(1,0)};
    Polygone p3 =new Polygone(pol1);
//    
//    System.out.println(x1);
//    System.out.println(y1);
//    System.out.println(w1);
//
//    //tester get sommet
//    System.out.println(p3.perimetre());
//    System.out.println(p3.surface());   
//    System.out.println(p3.texteSommets());
//    System.out.println(p1.equals(p2));   
//    System.out.println(p2.equals(p3));  
//    
//    System.out.println(p1);
//    System.out.println(p2);    
//    System.out.println(p3);        
//    
//______________________( 3 )___________________________________________________
    Point pp1 = new Point(0,0);
    Point pp2 = new Point(0,4);
    Point pp3 = new Point(4,0); 
    Polygone t3 = new Triangle(pp1,pp2,pp3);        
    Polygone t2 = new Triangle(pp1,pp2,pp3);          
//   
//    System.out.println(t2.surface());  
//    System.out.println(t3);
//    System.out.println(t2); 
//______________________( 4 )___________________________________________________
    Point ss = new Point(0,0);
    Point gg = new Point(0,4);
    Point rr = new Point(4,2); 
    
    Polygone r1 = new Rectangle(ss,rr);
//    
//
//    System.out.println(r1.surface());
//    System.out.println(r1);    

//______________________( 5 )___________________________________________________
    Point sss = new Point(0,0);
    Point ggg = new Point(0,4);
    
    Polygone c1 = new Carre(sss,6);
    
    System.out.println(c1.surface());
    System.out.println(c1);
  
//______________________( 6 )___________________________________________________ 

    ListePolygone maListe = new ListePolygone();
    maListe.ajoutPolygone(p1);
    maListe.afficheInfos();
    maListe.ajoutPolygone(p2);
    maListe.ajoutPolygone(t2);   
    maListe.ajoutPolygone(r1);   
    maListe.ajoutPolygone(c1); 
    maListe.afficheInfos();
    }
    
    
    //la bonne facon de declarer
    //Polygone p = new Rectangle();
    //et ensuite on peut parser pour utiliser 
    //((Rectangle)p).maMethode();
}
