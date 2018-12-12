
public class URLcímException extends Exception {
    private int hibakód;

    public URLcímException(int hibakód, String string) {
        super(string);
        this.hibakód = hibakód;
    }

    public int getHibakód() {
        return hibakód;
    }
    
    
    
}
