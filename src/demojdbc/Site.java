/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc;

/**
 *
 * @author brigh
 */
public class Site {

    private int id;
    private String nom;

    public Site() {
    }

    public Site(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Site{" + "id=" + id + ", nom=" + nom + '}';
    }

    // public static void main(String[] args) {
    // System.out.println("Site");
    // }

}
