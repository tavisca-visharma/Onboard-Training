package com.tavisca.workshops.pratham.rover;

public class MyMarsRoboRover {

    private static String getNewPosition(String currentPosition, String commands) {

        String positions[] = currentPosition.split(" ");
        int x = Integer.parseInt(positions[0]);
        int y = Integer.parseInt(positions[1]);
        String direction = positions[2];
        Position position = new Position(x, y, direction);

        RoveMars roveMars = new RoveMars(position);
        roveMars.startRove(commands);

        return roveMars.getNewPosition();
    }

    public static void main(String[] args) {
        String currentPosition = "3 3 E";
        String commands = "MMRMMRMRRM";
        String newPosition = getNewPosition(currentPosition, commands);

        System.out.println("currentPosition..." + " " + currentPosition);
        System.out.println("commands..." + " " + commands);
        System.out.println("newPosition..." + " " + newPosition);
    }


}
