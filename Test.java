
public class Test {
    public static void main(String[] args) {
        QuadraticEquation e1=new QuadraticEquation(3, 6, 2);
        QuadraticEquation e2=new QuadraticEquation(4, 6, 2.25);
        QuadraticEquation e3=new QuadraticEquation(9, 3, 5);
        
        if(e1.getDiscriminant()>0){
        System.out.println("Az első egyenlet eredménye: "+"x1="+e1.getRoot1()+" x2="+e1.getRoot2()+"\n");
        }
        else if(e1.getDiscriminant()==0){
            System.out.println("A közös gyök eredménye:"+(-e1.getB()/2*e1.getA())+"\n");
        }
        else{
            System.out.println("The equation has no roots."+"\n");
        }
        
        
        if(e2.getDiscriminant()>0){
        System.out.println("A második egyenlet eredménye: "+"x1="+e2.getRoot1()+" x2="+e2.getRoot2()+"\n");
        }
        else if(e2.getDiscriminant()==0){
            System.out.println("A közös gyök eredménye:"+(-e2.getB()/2*e2.getA())+"\n");
        }
        else{
            System.out.println("The equation has no roots."+"\n");
        }
        
        
        if(e3.getDiscriminant()>0){
        System.out.println("A harmadik egyenlet eredménye: "+"x1="+e3.getRoot1()+" x2="+e3.getRoot2()+"\n");
        }
        else if(e3.getDiscriminant()==0){
            System.out.println("A közös gyök eredméyne:"+(-e3.getB()/2*e3.getA())+"\n");
        }
        else{
            System.out.println("The equation has no roots."+"\n");
        }
    
    
}
}
