
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Persona {
    String nombre;
    String contra;
    int edad;
    String id;
    String Sexo;
    String estado;
    Objeto objeto;
    ArrayList lista=new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, int edad, String id, String Sexo, String estado, Objeto objeto,String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.Sexo = Sexo;
        this.estado = estado;
        this.objeto = objeto;
        this.contra=contra;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", Sexo=" + Sexo + ", estado=" + estado + ", objeto=" + objeto + ", lista=" + lista + '}';
    }
    
}
