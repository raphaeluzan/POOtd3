/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td2poo;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 *
 * @author Utilisateur
 */
public class Point {
    private static double CONST = 1e-10;
    
    private double x;
    private double y;


    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    /**
     *Méthode qui permet de calculer la distance entre 2 points
     * @param pt 
     * Point utilisé pour calculer la distance
     * @return 
     * Retourne un double qui est la distance entre nos deux points
     */
    public double distance(Point pt){
        return sqrt((Math.pow(this.getX() - pt.getX(),2))+ (Math.pow(this.getY() - pt.getY(),2)));
    }
    /**
     *Méthode qui prend en entrée deux double et qui retourne true s'il sont egaux à epsilon près
     * @param a
     *  premiere valeur testée dans la méthode
     * @param b
     *  deuxième valeur testée dans la méthode
     * @return 
     *  renvoie true si les deux valeurs sont égales à epsilon près
     */
    public static boolean memeReel(double a, double b){
        return ( abs(a-b) < CONST );
    }

    
    @Override
    public boolean equals(Object obj){
        if(obj==null || !(obj instanceof Point)){
            return false;
        }
        Point l = (Point) obj;
        return ( memeReel(this.x, l.getX() ) && memeReel(this.y,l.getY()) ) ;
    }
// equals ou memereel ?
    
    public String toString(){
        
        return "<" + this.getX() + "," + this.getY() + ">";
    }

    /**
     * @return Renvoie la valeur x de notre objet Point c'est à dire l'abscisse de ce point.
     */
    public double getX() {
        return x;
    }

    /**
     * @return Renvoie la valeur y de notre objet Point c'est à dire l'ordonnée de ce point.
     */
    public double getY() {
        return y;
    }

    


}
