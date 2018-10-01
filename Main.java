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
