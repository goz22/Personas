package personas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gozie
 */
public class Asignatura 
{   private String nombre;
    private int codigo;
    private int cantClases;
    private int cantExamenes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantClases() {
        return cantClases;
    }

    public void setCantClases(int cantClases) {
        this.cantClases = cantClases;
    }

    public int getCantExamenes() {
        return cantExamenes;
    }

    public void setCantExamenes(int cantExamenes) {
        this.cantExamenes = cantExamenes;
    }

    public Asignatura(String nombre, int codigo, int cantClases, int cantExamenes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantClases = cantClases;
        this.cantExamenes = cantExamenes;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", codigo=" + codigo + ", cantClases=" + cantClases + ", cantExamenes=" + cantExamenes + '}';
    }
            
    
}
