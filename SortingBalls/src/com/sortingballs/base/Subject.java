package com.sortingballs.base;

/**
 * Created by sekhar on 28/12/16.
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
