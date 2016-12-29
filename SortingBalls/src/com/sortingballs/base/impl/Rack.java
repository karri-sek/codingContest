package com.sortingballs.base.impl;

import java.util.ArrayList;
import java.util.List;

import com.sortingballs.base.Observer;
import com.sortingballs.base.Subject;
import com.sortingballs.base.model.Ball;

/**
 * Created by sekhar on 28/12/16.
 */
public class Rack implements Subject {

    Ball ball;

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
	for (Observer observer : listOfObservers) {
	    observer.update(this.ball);
	}
    }

    public void add(Ball ball) throws UnsupportedOperationException {
	if (listOfObservers.size() < 1) {
	    throw new UnsupportedOperationException("No Observers registered");
	}
	this.ball = ball;
	this.notifyObservers();
    }

    public List<Ball> getBalls() {
	for (Observer observer : listOfObservers) {
	   return observer.getSortedBalls();
	}
	return null;
    }

    public int getNoOfObservers() {
	return listOfObservers.size();
    }

}
