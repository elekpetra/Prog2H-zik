public class URLcím {
    private String protokoll;
    private String tartomány;
    private String elérésiút;
    
    public URLcím(String urlcím) throws URLcímException{ // throws URLcímException ---> fgv(konstruktor) 
                                                         //nem kezeli le a kivétlet, hanem tovább dobja , ha több kivétel van amit
                                                         //nem akarok lekezlni akkor vesszővel throws után fel lehet sorolni 
            if (urlcím.length()<5)
                throw new URLcímException(1, "a cím nem elég hosszú");
            if(!(urlcím.contains("://")))
                throw new URLcímException(2, "nincs benne ://");
            if(urlcím.indexOf("://")!=urlcím.lastIndexOf("://"))
                throw new URLcímException(2, "többször vvan benne ://");
            // :// után elvágom
            String []tmp1=urlcím.split("://");
            if(!(tmp1[0].equals("http" )|| tmp1[0].equals("ftp") || tmp1[0].equals("file")))
                throw new URLcímException(3, "nem megfelelő protokoll");
            this.protokoll=tmp1[0];
            if(! tmp1[1].contains("/"))
            {
                this.elérésiút=""; 
                String [] tmp2=tmp1[2].split("\\.",-1);  //split refuláris kifejezést vár és úgy ismeri fel a pontot hogy \\ irok elé
                if( tmp2.length==1){
                    throw new URLcímException(4, "nincs pont");
                }
                for(String s: tmp2){
                    if(s.equals("")){
                        throw new URLcímException(4, "két pont van egymás mellett, vagy a végén van egy pont"); //feldaraboltban van .. akkor közte üresstring van
                }}
                if(tmp2[tmp2.length-1].length()<2){
                        throw new URLcímException(4, "utolsó pont utáni rész rövid");
                
                }
            this.tartomány=tmp1[1];
            
            }
            else{ // 5.eset
               
            }
                
    }

    @Override
    public String toString() {
        return "URLc\u00edm{" + "protokoll=" + protokoll + ", tartom\u00e1ny=" + tartomány + ", el\u00e9r\u00e9si\u00fat=" + elérésiút + '}';
    }
    
    
}
