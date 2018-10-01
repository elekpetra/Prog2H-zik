
public class Test {
    public static void main(String[] args) {
        
        LinearEquation e1=new LinearEquation(1,2,3,4,5,6);
        LinearEquation e2=new LinearEquation(5,8,4,9,3,4);
        LinearEquation e3=new LinearEquation(12,54,62,22,59,4);
        
        if(e1.isSolvable()==true){
        System.out.println("Az első egyenlet eredménye: "+"x1="+e1.getX()+" x2="+e1.getY()+"\n");
        }
        else if((e1.getA()*e1.getD()-e1.getB()*e1.getC())==0){
            System.out.println("The equation has no solution"+"\n");
        }
        
        if(e2.isSolvable()==true){
        System.out.println("A második egyenlet eredménye: "+"x1="+e2.getX()+" x2="+e2.getY()+"\n");
        }
        else if((e2.getA()*e2.getD()-e2.getB()*e2.getC())==0){
            System.out.println("The equation has no solution"+"\n");
        }
        
        if(e3.isSolvable()==true){
        System.out.println("A hamadik egyenlet eredménye: "+"x1="+e3.getX()+" x2="+e3.getY()+"\n");
        }
        else if((e3.getA()*e3.getD()-e3.getB()*e3.getC())==0){
            System.out.println("The equation has no solution"+"\n");
        }
    
}
}
