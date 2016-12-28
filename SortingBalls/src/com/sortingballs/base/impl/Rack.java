package com.sortingballs.base.impl;

import com.sortingballs.base.Observer;
import com.sortingballs.base.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sekhar on 28/12/16.
 */
public class Rack implements Subject {

    private List<Observer> listOfObservers = new ArrayList<Observer>();
    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:listOfObservers){
            observer.update();
        }
    }
}
