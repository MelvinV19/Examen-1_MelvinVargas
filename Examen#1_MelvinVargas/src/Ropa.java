/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ropa extends Objeto{
    String talla;
    String material;
    String pais;

    public Ropa() {
    }

    public Ropa(String talla, String material, String pais) {
        this.talla = talla;
        this.material = material;
        this.pais = pais;
    }

    public Ropa(String talla, String material, String pais, String color, String descripcion, String marca, String tam, String calidad, double precio, Familiar dueño) {
        super(color, descripcion, marca, tam, calidad, precio, dueño);
        this.talla = talla;
        this.material = material;
        this.pais = pais;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", material=" + material + ", pais=" + pais + '}';
    }
    
}
