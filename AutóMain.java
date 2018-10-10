
import java.util.Arrays;


public class AutóMain {
       

    public static void main(String[] args) {
        Autó[] autók = new Autó[]{
            new Autó("ABC123",254),
            new Autó("ASD456",364),
            new Autó("SAS987",455),
            new Autó("BAB345",67),
            new Autó("LOL555",567),
            new Teherautó("NCE453",566,354),
            new Teherautó("MLM828",215,545),
            new Teherautó("GHK568",654,872),
            new Teherautó("KJH845",220,458),
            new Teherautó("VNB784",768,112),};
            
        Teherautó[] teherautók = new Teherautó[]{
            new Teherautó("XXX555",220,450),
            new Teherautó("DGH546",545,200),
            new Teherautó("FDG545",800,610),
            new Teherautó("HGJ655",620,501),
            new Teherautó("KHJ",100,500),
            new Teherautó("KKP354",875,100),
            new Teherautó("AEF265",156,980),
            new Teherautó("SDF465",340,534),
            new Teherautó("REG111",453,300),
            new Teherautó("ASD564",240,545),
        };
        
        
        rendezMaxSzállíthatóTeherCsökkenőleg(teherautók);
        
        for(int i=0;i<teherautók.length;i++){
            
        System.out.println(teherautók[i].getMaxSzállíthatóTeher());
        } 
        
        
        
        Autó a =keresMaxMotorTeljesítmény(autók);
        System.out.println(a.getMotorTeljesítmény());

       
      
    }
    
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        Teherautó m = new Teherautó();
        Arrays.sort(teher,m);
    }
    
    public static Autó keresMaxMotorTeljesítmény(Autó[] autó){
        MotorTeljesítmény motor = new MotorTeljesítmény();
        Arrays.sort(autó,motor);
        return autó[1];
     
     
     
    } 
}

