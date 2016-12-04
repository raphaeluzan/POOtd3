/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td2poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utilisateur
 */
public class ListePolygone {
    private List<Polygone> listePolygone = new ArrayList<Polygone>();
    // List l = new ArrayList();
    
    public ListePolygone(){
    }
    public void ajoutPolygone(Polygone pol){
        listePolygone.add(pol);
    }
    
    public void afficheInfos(){
        //affichage a verifier
        for(int j=0;j<listePolygone.size();j++){
            System.out.println(listePolygone.get(j));
        }
    }
    @Override
    public String toString(){
        return "liste de " + listePolygone.size() + " polygones";
    }
}
