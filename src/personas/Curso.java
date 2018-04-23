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
public class Curso 
{   private int cantAlumnos;
    private Asignatura asignatura;
    private Alumno[] alumno;

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno[] alumno) {
        this.alumno = alumno;
    }

    public Curso(int cantAlumnos, Asignatura asignatura) {
        this.cantAlumnos = cantAlumnos;
        this.asignatura = asignatura;
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Curso{" + "cantAlumnos=" + cantAlumnos + ", asignatura=" + asignatura + ", alumno=" + alumno + '}';
    }
    
}
    
