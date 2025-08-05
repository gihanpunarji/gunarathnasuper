package dto;

/**
 *
 * @author gihanpunarji
 */
public class Product {
    private int id;
    private String barcode;
    private String siName;
    private String enName;
    private double weladapalaMila;
    private double apeMila;

    public Product(String barcode, String siName, String enName, double weladapalaMila, double apeMila) {
        this.barcode = barcode;
        this.siName = siName;
        this.enName = enName;
        this.weladapalaMila = weladapalaMila;
        this.apeMila = apeMila;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSiName() {
        return siName;
    }

    public void setSiName(String siName) {
        this.siName = siName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public double getWeladapalaMila() {
        return weladapalaMila;
    }

    public void setWeladapalaMila(double weladapalaMila) {
        this.weladapalaMila = weladapalaMila;
    }

    public double getApeMila() {
        return apeMila;
    }

    public void setApeMila(double apeMila) {
        this.apeMila = apeMila;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
