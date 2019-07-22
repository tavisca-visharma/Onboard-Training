package com.tavisca.workshops.pratham.marsrover;

public interface IMarsRover {
    boolean selectDirectionMethod(String direction);

    void rove(Position position, String command);
}
