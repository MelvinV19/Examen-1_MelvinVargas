
import java.util.ArrayList;


public class Objeto {
    String color;
    String descripcion;
    String marca;
    String tam;
    String calidad;
    double precio;
    String tipo;
    String dueño;

    public Objeto() {
    }

    public Objeto(String color, String descripcion, String marca, String tam, String calidad, double precio, String dueño,String tipo) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tam = tam;
        this.calidad = calidad;
        this.precio = precio;
        this.dueño = dueño;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }
    

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public String getTam() {
        return tam;
    }

    public String getCalidad() {
        return calidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDueño() {
        return dueño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", tam=" + tam + ", calidad=" + calidad + ", precio=" + precio + ", due\u00f1o=" + dueño + '}';
    }
    
    
}
