public class Tanuló extends Fejesek{
    public String név;
    public String előtte = "";

    public Tanuló(String név, String előtte){
        this.név = név;
        this.előtte = előtte;
    }

    public Tanuló(String név){
        this.név = név;
    }
}
