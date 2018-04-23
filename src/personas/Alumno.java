/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author gozie
 */
public class Alumno extends Persona
{   
    private Asignatura asignatura;
    private boolean[] asistencia;
    private int[] notas;

    public Asignatura getAsignatura() {
        return asignatura;
    }
    
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura=asignatura;        
    }
    
    public boolean [] getAsistencia() {
        return asistencia;
    }
    
    public void setAsistencia(boolean [] asistencia) {
        this.asistencia=asistencia;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public Alumno(Asignatura asignatura, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.asignatura = asignatura;
        this.asistencia = asistencia;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "asignatura=" + asignatura + ", asistencia=" + asistencia + ", notas=" + notas + '}';
    }
    
}
    
    
    

