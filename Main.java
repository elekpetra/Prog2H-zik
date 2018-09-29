/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soly5
 */
public class Main {
    public static void main(String[] args) {
        Rectangle a=new Rectangle(4,40);
        Rectangle b=new Rectangle(3.5,35.9);
        
        System.out.println("'A' téglalap szélessége: "+a.getWidth()+"\n"+
            "'A' téglalap magassága: "+a.getHeight()+"\n"+
            "'A' tégalap területe: "+a.getArea()+"\n"+
            "'A' téglalap kerülete: "+a.getPrimeter());
        
        System.out.println("'B' téglalap szélessége: "+b.getWidth()+"\n"+
            "'B' téglalap magassága: "+b.getHeight()+"\n"+
            "'B' tégalap területe: "+b.getArea()+"\n"+
            "'B' téglalap kerülete: "+b.getPrimeter());
        
        
    }
}
