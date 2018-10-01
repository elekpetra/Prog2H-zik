/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soly5
 */
public class Fordít {
    static void ForditottSzam(int n){
        int ujszam=0;
        
        do{
            ujszam=ujszam*10+(n%10);
            n=n/10;
        }while(n!=0);
        System.out.println(ujszam);
    }
    
    public static void main(String[] args) {
        ForditottSzam(321);
    }
}
