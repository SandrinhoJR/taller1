/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casting;

import modelo.Gato;
import modelo.Mascota;

/**
 *
 * @author sandro rendon
 */
public class TestCastingSeguro {

    public static void main(String[] args) {
        // Se crea una mascota, esta vez un Gato llamado Michi
        Mascota m = new Gato("Michi");

        // Se verifica si la mascota es un Gato antes de castear
        if (m instanceof Gato) {
            Gato g = (Gato) m;
            g.maullar(); // Si sí es un Gato, se llama su método maullar
        } else {
            // Si no es un Gato, muestra este mensaje
            System.out.println("No es un gato, no se puede maullar.");
        }
    }
}
