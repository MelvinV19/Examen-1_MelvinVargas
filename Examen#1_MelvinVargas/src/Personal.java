
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
public class Personal extends Persona{
    String ocupacion;
    String horario;
    String tiempo;
    double sueldo;
    ArrayList<Objeto> lista2=new ArrayList();
    public Personal() {
    }

    public Personal(String ocupacion, String horario, String tiempo, double sueldo) {
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    public Personal(String ocupacion, String horario, String tiempo, double sueldo, String nombre, int edad, String id, String Sexo, String estado, Objeto objeto,String contra) {
        super(nombre, edad, id, Sexo, estado, objeto,contra);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
        this.contra=contra;
    }

    

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Objeto> getLista() {
        return lista;
    }

    public void setLista2(ArrayList<Objeto> lista) {
        this.lista = lista;
    }
    
    @Override
    public String toString() {
        return "Personal: "+super.getNombre()+"\n"+"contraseña: "+super.getContra()+"\n" + "ocupacion: " + ocupacion + "\n"+"Objetos: "+lista+"\n";
    }
    
}
