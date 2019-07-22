package com.tavisca.workshops.pratham.rover;

public interface IMarsRover {
    boolean selectDirectionMethod(String direction);

    void rove(Position position, String command);
}
