package com.tavisca.workshops.pratham.rover;

import java.util.ArrayList;
import java.util.List;

public class RoveMars {

    List<IMarsRover> directions;
    Position position;
//    private String newPosition;

    RoveMars(Position position) {
        this.position = position;
        directions = new ArrayList<IMarsRover>();
        directions.add(new RoveEast());
        directions.add(new RoveWest());
        directions.add(new RoveNorth());
        directions.add(new RoveSouth());
    }

    public void startRove(String commands) {
        for (char command : commands.toCharArray()) {
            rove(this.position, command + "");
        }
    }

    private void rove(Position position, String command) {
        for (int i = 0; i < directions.size(); i++) {
            if (directions.get(i).selectDirectionMethod(position.getDirection()) == true) {
                directions.get(i).rove(position, command);
                break;
            }
        }
    }

    public String getNewPosition() {
        return position.getX() + " " + position.getY() + " " + position.getDirection();
    }

}
