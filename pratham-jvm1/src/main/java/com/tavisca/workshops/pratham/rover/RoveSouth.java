package com.tavisca.workshops.pratham.rover;

public class RoveSouth implements IMarsRover {

    public boolean selectDirectionMethod(String direction) {
        return direction.contains("S");
    }

    public void rove(Position position, String command) {
        switch (command) {
            case "L":
                position.setDirection("E");
                break;
            case "R":
                position.setDirection("W");
                break;
            case "M":
                position.decrementY();
        }
    }
}
