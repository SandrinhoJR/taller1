/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sandro rendon
 */
public class Mascota {

    // Atributo para guardar el nombre de la mascota (accesible desde clases hijas)
    protected String nombre;

    // Constructor que recibe el nombre y lo guarda
    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    // Método para que la mascota salude mostrando su nombre
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
