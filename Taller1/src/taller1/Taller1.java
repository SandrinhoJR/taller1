/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import modelo.Clinica;
import modelo.Gato;
import modelo.Mascota;
import modelo.Perro;

/**
 *
 * @author sandro rendon
 */
public class Taller1 {

    public static void main(String[] args) {
        // Se crea una clínica para manejar mascotas
        Clinica c = new Clinica();

        // Se crean dos mascotas: un Perro y un Gato
        Mascota m1 = new Perro("Toby");
        Mascota m2 = new Gato("Pelusa");

        // Se envían las mascotas a la clínica para que las reciba
        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
}
