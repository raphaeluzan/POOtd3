package td2poo;


import td2poo.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilisateur
 */
public class Carre extends Rectangle {
    private double l;
    
        public Carre(Point x1,double longueur){
        super(x1,new Point(x1.getX()+ longueur,x1.getY()-longueur));
        this.l=longueur;
    }
    @Override
    public double surface(){
    return l*l;
}
    @Override
    public String toString(){
        return "carré à plat \n" + this.texteSommets();
    }
}
