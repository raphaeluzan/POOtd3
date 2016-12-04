/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td2poo;

import static java.lang.Math.abs;

/**
 *
 * @author Utilisateur
 */
public class Rectangle extends Polygone {


    
    
    public Rectangle(Point PA,Point PC){
//        Point PB = new Point(5,6);
//        Point PD = new Point(PA.getX(), PC.getY());
 //       Point[] R = {PA,new Point(PC.getX(),PA.getY()),PC,new Point(PA.getX(), PC.getY())};  
        super(PA,new Point(PC.getX(),PA.getY()),PC,new Point (PA.getX(), PC.getY()));
    }
    //mettre au bonne endroit le sg et le id?
    
    @Override
    public double surface(){
        //on a les points (x1,y1) et (x2,y2)
   
        double x1 = this.n[0].getX() ,y1 = this.n[0].getY();
        double x2 = this.n[2].getX(), y2 = this.n[2].getY();
        return (abs(x1 - x2)*abs(y1 - y2)) ;
    }
    @Override
    public String toString(){
      return "rectangle à plat \n" + this.texteSommets();
    }
    
}
