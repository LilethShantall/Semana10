/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcional.medieval;

public class Ogre implements Observer{
    private String name;
    private int strength;
    private String home;

    public Ogre(String name, int strength, String home) {
        this.name = name;
        this.strength = strength;
        this.home = home;
    }

    @Override
    public void update(String season) {
        switch (season) {
            case "Otoño":
                System.out.println(name + " dice: Voy a cazar.");
                break;
            case "Invierno":
                System.out.println(name + " dice: Me bañaré en mi pantano.");
                break;
            case "Primavera":
                System.out.println(name + " dice: Sigo durmiendo.");
                break;
            case "Verano":
                System.out.println(name + " dice: Voy a comer.");
                break;
        }
    }
}