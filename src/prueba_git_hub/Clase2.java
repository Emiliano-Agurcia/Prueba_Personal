/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git_hub;

/**
 *
 * @author emili
 */
public class Clase2 {
    String nombre;
    int edad;

    public Clase2() {
    }

    public Clase2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Clase2{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
