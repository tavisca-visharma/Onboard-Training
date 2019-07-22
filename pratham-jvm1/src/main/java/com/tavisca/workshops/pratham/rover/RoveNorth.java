package com.tavisca.workshops.pratham.rover;

public class RoveNorth implements IMarsRover {

    public boolean selectDirectionMethod(String direction) {
        return direction.contains("N");
    }

    public void rove(Position position, String command) {
        switch (command) {
            case "L":
                position.setDirection("W");
                break;
            case "R":
                position.setDirection("E");
                break;
            case "M":
                position.incrementY();
        }

    }
}
