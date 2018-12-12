
public class main {
      public static void main(String[] args) {
       int a=0;
       try{
       URLcím u=new URLcím("http://inf.unideb.hu");
           System.out.println("");
       }catch(URLcímException e){
           System.out.println(e.getHibakód()+" "+e.getMessage());
       }
       System.out.println("a program vége "+a);
}
}
