/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sandro rendon
 */
public class Perro extends Mascota {

    // Constructor que le pasa el nombre al constructor de la clase Mascota
    public Perro(String nombre) {
        super(nombre);
    }

    // Método específico de Perro para que ladre
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
}
