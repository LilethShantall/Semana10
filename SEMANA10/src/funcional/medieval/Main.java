/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcional.medieval;

public class Main {
    public static void main(String[] args) {
        Sujeto weather = new Sujeto();

        Ogre shrek = new Ogre("Shrek", 100, "Pantano");
        Duende legolas = new Duende("Legolas", 200, "Verde");

        weather.subscribe(shrek);
        weather.subscribe(legolas);

        System.out.println("Notificación de cambio de estación:");
        weather.changeSeason("Otoño");   // Cambia a OtoñoD
        weather.changeSeason("Invierno"); // Cambia a Invierno
        weather.changeSeason("Primavera"); // Cambia a Primavera
        weather.changeSeason("Verano");    // Cambia a Verano
    }
}