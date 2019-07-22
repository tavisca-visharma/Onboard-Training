package com.tavisca.workshops.pratham.rover;

public class RoveWest implements IMarsRover {

    public boolean selectDirectionMethod(String direction) {
        return direction.contains("W");
    }

    public void rove(Position position, String command) {
        switch (command) {
            case "L":
                position.setDirection("S");
                break;
            case "R":
                position.setDirection("N");
                break;
            case "M":
                position.decrementX();
                break;
        }
    }
}
