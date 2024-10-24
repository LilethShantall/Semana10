/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcional.medieval;

public class Duende implements Observer{
    private String name;
    private int magicLevel;
    private String color;

    public Duende(String name, int magicLevel, String color) {
        this.name = name;
        this.magicLevel = magicLevel;
        this.color = color;
    }

    @Override
    public void update(String season) {
        switch (season) {
            case "Otoño":
                System.out.println(name + " dice: Debo trabajar.");
                break;
            case "Invierno":
                System.out.println(name + " dice: Hora de dormir.");
                break;
            case "Primavera":
                System.out.println(name + " dice: El duende hace magia.");
                break;
            case "Verano":
                System.out.println(name + " dice: Momento de salir a disfrutar el paisaje.");
                break;
        }
    }
}