public class AngolMagyarSzótár {
    private String angol;
    private String magyar;

    public AngolMagyarSzótár(String angol, String magyar){
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public String getMagyar() {
        return magyar;
    }

    @Override
    public String toString() {
        return angol + ":" + magyar;
    }
    
 
}
    
