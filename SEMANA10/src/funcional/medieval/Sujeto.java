/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcional.medieval;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observer> observers = new ArrayList<>();
    private String season;

    public void subscribe(Observer observer) {
        observers.add(observer);
    }


    public void changeSeason(String newSeason) {
        this.season = newSeason;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(season);
        }
    }

}