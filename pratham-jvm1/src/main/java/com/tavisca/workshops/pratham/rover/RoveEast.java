package com.tavisca.workshops.pratham.rover;

public class RoveEast implements IMarsRover {

    public boolean selectDirectionMethod(String direction) {
        return direction.contains("E");
    }

    public void rove(Position position, String command) {
        switch (command) {
            case "L":
                position.setDirection("N");
                break;
            case "R":
                position.setDirection("S");
                break;
            case "M":
                position.incrementX();
        }
    }
}
