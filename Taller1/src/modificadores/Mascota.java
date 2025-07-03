/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadores;

/**
 *
 * @author sandro rendon
 */
public class Mascota {
    
    // Atributo privado, solo se puede usar dentro de esta clase
    private String nombrePrivado = "Privado";

    // Atributo con modificador por defecto, accesible solo dentro del mismo paquete
    String nombreDefault = "Default";

    // Atributo protegido, accesible en el mismo paquete y en subclases
    protected String nombreProtegido = "Protegido";

    // Atributo público, se puede usar desde cualquier clase
    public String nombrePublico = "Publico";

    // Método privado, solo se puede usar dentro de esta clase
    private void metodoPrivado() {
        System.out.println("Metodo privado");
    }

    // Método con acceso por defecto, accesible solo dentro del mismo paquete
    void metodoDefault() {
        System.out.println("Metodo default");
    }

    // Método protegido, accesible desde subclases o en el mismo paquete
    protected void metodoProtegido() {
        System.out.println("Metodo protegido");
    }

    // Método público, accesible desde cualquier clase
    public void metodoPublico() {
        System.out.println("Metodo publico");
    }
}
    

