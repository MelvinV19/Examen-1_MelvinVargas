
public class Zapatos extends Objeto{
    String talla;
    String suela;
    String confort;

    public Zapatos() {
    }

    public Zapatos(String talla, String suela, String confort) {
        this.talla = talla;
        this.suela = suela;
        this.confort = confort;
    }

    public Zapatos(String talla, String suela, String confort, String color, String descripcion, String marca, String tam, String calidad, double precio, String dueño,String tipo) {
        super(color, descripcion, marca, tam, calidad, precio, dueño,tipo);
        this.talla = talla;
        this.suela = suela;
        this.confort = confort;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public String getConfort() {
        return confort;
    }

    public void setConfort(String confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "Zapatos"+" "+"color: "+super.getColor()+" "+"Descripcion: "+super.getDescripcion()+" "+"marca: "+super.getMarca()+" "+"tamaño:"+super.getTam()+"\n" ;
    }
    
    
}
