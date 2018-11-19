/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

public class Dolgozat implements egyetem.Pontozhato<Dolgozat> {
    public int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }

    @Override
    public boolean megfelelt() {
        if(this.pontszam>35) {
            return true;
        }
        if(this.pontszam==-1) {
            System.out.println("Nem írt");
            return false;
            
        }
        return false;
    }
    
    
}