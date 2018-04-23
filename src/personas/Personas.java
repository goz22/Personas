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
public class Personas {

    public static void main(String[] args) 
    {   Persona persona1 = new Persona("Leonardo", "Díaz", 29714721, 35);
        Asignatura asignatura1 = new Asignatura("Matemáticas", 1, 20, 3);
        Alumno alumno1 = new Alumno(asignatura1, "Leonardo", "Díaz", 29714721, 35);
        Curso cursillo = new Curso(20, asignatura1);
        Alumno[] ingresantes = new Alumno[cursillo.getCantAlumnos()];
        cursillo.setAlumno(ingresantes);
        ingresantes[0] = new Alumno(asignatura1, "Negro", "Gonzales", 45111256, 45);
        ingresantes[1] = alumno1;
        
        ingresantes[0].setAsistencia(new boolean[]{true,false,true,false});
        ingresantes[0].setNotas(new int[]{2,3,6});
        System.out.println("Nombre del Curso: " + asignatura1.getNombre());
        System.out.println("Cantidad de Alumnos: " + cursillo.getCantAlumnos());
        System.out.println("Nombre de Alumno:" + alumno1.getNombre());
        System.out.println("Nombre de Alumno:" );
    }
    
}
