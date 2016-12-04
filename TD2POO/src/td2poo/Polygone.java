/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td2poo;

/**
 *
 * @author Utilisateur
 */
public class Polygone {
    protected Point[] n ;
    
    public Polygone(Point[] x){
        n=x; 
    }
    public Polygone(Point x , Point y){
        Point[] r  ={x,y};
        this.n=r;
    }
    public Polygone(Point x , Point y, Point z){
        Point[] r  ={x,y,z};
        this.n=r;
    }    
    
    
    public Polygone(Point w, Point x , Point y, Point z){
        Point[] r  ={w,x,y,z};
        this.n=r;
    }    
        
    public double perimetre(){
        double per = 0;
        if (n.length >1){
            int i =0;
            per=per + ((n[0]).distance(n[n.length-1]));            
            while(i<n.length-1){
                System.out.println((i+1));
                per=per + (n[i]).distance(n[i+1]);           
                i++;
            }          
        }
        
        return per;
    }
    public double surface(){
        return -1;
    }
    
    public String texteSommets(){
        String var = "";
        for(int i =0;i<n.length;i++){
            var = var + "case[" + i + "]  =  "+ (n[i]).toString() + "\n";
        }
        return var ;
    }
    
    
    @Override
    public boolean equals(Object obj ){
        if(obj==null || !(obj instanceof Polygone)){
            return false;
        }
        Polygone a = (Polygone) obj;       
        
    boolean test = true;
    if( a.getSommets().length != n.length ){
        return false;
    }        
        for(int i =0;i<n.length;i++){
            if (!( ((a.getSommets())[i]).equals(this.n[i]) )){
                return false;
        }
        }
    return test;
    }
    //? meme debut = meme pol?

    @Override
    public String toString(){
        String var = "";
        for(int i =0;i<n.length;i++){
            var = var + "sommet[" + i + "]  =  "+ (n[i]).toString() + "\n";
        }
        return   ( "Polygone à " + n.length + " sommets : \n" + var) ;

    }
    
    /**
     *
     * @return
     */
   public Point[] getSommets() {
        return n;
    }

}

