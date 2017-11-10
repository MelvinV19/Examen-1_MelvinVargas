
import java.util.ArrayList;


public class Familiar extends Persona{
    String rol;
    String trabajo;
    double altura;
    double peso;
    ArrayList<Objeto> lista=new ArrayList();

    public Familiar() {
    }

    public Familiar(String rol, String trabajo, double altura, double peso) {
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public Familiar(String rol, String trabajo, double altura, double peso, String nombre, int edad, String id, String Sexo, String estado, Objeto objeto) {
        super(nombre, edad, id, Sexo, estado, objeto);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<Objeto> getLista() {
        return lista;
    }

    public void setObjetos(ArrayList<Objeto> lista) {
        this.lista = lista;
    }
    
}
