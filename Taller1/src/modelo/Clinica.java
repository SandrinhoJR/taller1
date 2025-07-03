/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sandro rendon
 */
public class Clinica {

    // Método que recibe cualquier objeto que sea una Mascota (o que herede de ella)
    public void recibirMascota(Mascota m) {
        System.out.println("Recibiendo a: " + m.nombre);
        m.saludar(); // Llama al método saludar, definido en la clase Mascota o en sus hijas

        // Verifica si la mascota es un Perro y le hace ladrar
        if (m instanceof Perro) {
            ((Perro) m).ladrar();
        } // Si no es Perro, revisa si es un Gato y hace que maúlle
        else if (m instanceof Gato) {
            ((Gato) m).maullar();
        } // Si no es ninguna de las dos, imprime un mensaje genérico
        else {
            System.out.println("Tipo de mascota no reconocido.");
        }
    }
}
