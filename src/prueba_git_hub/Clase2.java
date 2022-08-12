
package prueba_git_hub;

/**
 *
 * @author emili
 */
public class Clase2 {
    String nombre;
    int edad;
    int altura;

    public Clase2() {
    }

    public Clase2(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Clase2{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }
    
    
}
