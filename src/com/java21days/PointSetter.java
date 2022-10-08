package com.java21days;

import java.awt.*;
import java.util.Scanner;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(0, 0);


    }

    static void readLocation(Point location) {
        System.out.println("X: " + location.x);
        System.out.println("Y: " + location.y);
    }

    static void moveRight(Point location) {
        location.x++;
    }

    static void moveLeft(Point location) {
        location.x--;
    }

    static void moveUp(Point location) {
        location.y++;
    }

    static void moveDown(Point location) {
        location.y--;
    }

    static void getDirections(Point location) {
        boolean exit = false;
        while(!exit) {
            System.out.println("Where should we go?\n\r>");
            Scanner scanner = new Scanner(System.in);
            String direction = scanner.nextLine();

            switch(direction) {
                case "right":
                case "r":
                    moveRight(location);
                case "left":
                case "l":
                    moveLeft(location);
                case "up":
                case "u":
                    moveUp(location);
                case "down":
                case "d":
                    moveDown(location);
            }
        }
    }
}
