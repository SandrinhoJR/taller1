/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sandro rendon
 */
public class Gato extends Mascota {

    // Constructor que llama al constructor de la clase Mascota y le pasa el nombre
    public Gato(String nombre) {
        super(nombre);
    }

    // Método específico de Gato para que maúlle
    public void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}
