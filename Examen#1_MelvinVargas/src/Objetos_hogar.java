
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Objetos_hogar extends Objeto {
    String tiempo;
    String area;
    String instrucciones;
    Date fecha;

    public Objetos_hogar() {
    }

    public Objetos_hogar(String tiempo, String area, String instrucciones, Date fecha) {
        this.tiempo = tiempo;
        this.area = area;
        this.instrucciones = instrucciones;
        this.fecha = fecha;
    }

    public Objetos_hogar(String tiempo, String area, String instrucciones, Date fecha, String color, String descripcion, String marca, String tam, String calidad, double precio, String dueño,String tipo) {
        super(color, descripcion, marca, tam, calidad, precio, dueño,tipo);
        this.tiempo = tiempo;
        this.area = area;
        this.instrucciones = instrucciones;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Objeto de hogar"+"\n"+"color: "+super.getColor()+"\n"+"Descripcion: "+super.getDescripcion()+"\n"+"marca: "+super.getMarca()+"\n"+"tamaño:"+super.getTam()+"\n" ;
    }
    
}
