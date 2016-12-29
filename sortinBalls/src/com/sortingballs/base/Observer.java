package com.sortingballs.base;

import java.util.List;

import com.sortingballs.base.model.Ball;

/**
 * Created by sekhar on 28/12/16.
 */
public interface Observer {
    
    public void update(Ball ball);

    public List<Ball> getSortedBalls();
}
