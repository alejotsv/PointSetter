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
                    break;
                case "left":
                case "l":
                    moveLeft(location);
                    break;
                case "up":
                case "u":
                    moveUp(location);
                    break;
                case "down":
                case "d":
                    moveDown(location);
                    break;
                case "exit":
                case "q":
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid command: right (r), left (l), up (u), down (d), exit (q)");
            }
        }
    }
}
