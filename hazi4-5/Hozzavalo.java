/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat12;


public class Hozzavalo implements Comparable<Hozzavalo>{
    
    public String hozzavalok;
    public int darabszam;

    public Hozzavalo(String hozzavalok, int darabszam) {
        this.hozzavalok = hozzavalok;
        this.darabszam = darabszam;
    }

    public String getHozzavalok() {
        return hozzavalok;
    }

    public void setHozzavalok(String hozzavalok) {
        this.hozzavalok = hozzavalok;
    }

    public int getDarabszam() {
        return darabszam;
    }

    public void setDarabszam(int darabszam) {
        this.darabszam = darabszam;
    }
    
    @Override
    public String toString() {
        return hozzavalok + ";" + darabszam;
    }

    @Override
    public int compareTo(Hozzavalo h) {
        int kulonbseg = h.darabszam - this.darabszam;
        if(kulonbseg != 0)
            return kulonbseg;
        return this.hozzavalok.compareTo(h.hozzavalok);
    }
}

