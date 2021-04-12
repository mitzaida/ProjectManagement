package com.test;

import lombok.SneakyThrows;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Wildcard {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Circle> sourceList = new ArrayList<>();
        List<?> shapes = sourceList;
        List<? extends Shape> shapesCircle = sourceList;
        List<? extends Shape> shapesSquare = new ArrayList<Square>();
        List<? extends Shape> shapesShape = new ArrayList<Shape>();
        List<? extends Circle> circles = sourceList;
//        List<? extends Circle> circlesSquares = new ArrayList<Square>();
//        List<? extends Circle> circleShapes = new ArrayList<Shape>();
        List<? extends Square> squareSquare = new ArrayList<Square>();
//        List<? extends Square> squareCircle = new ArrayList<Circle>();
//        List<? extends Square> squareShape = new ArrayList<Shape>();

        List<?> shapes2 = sourceList;
//        List<? super Shape> shapesCircle2 = new ArrayList<Circle>();
//        List<? super Shape> shapesSquare2 = new ArrayList<Square>();
        List<? super Shape> shapesShape2 = new ArrayList<Shape>();
        List<? super Circle> circles2 = sourceList;
//        List<? super Circle> circlesSquares2 = new ArrayList<Square>();
        List<? super Circle> circleShapes2 = new ArrayList<Shape>();
        List<? super Square> squareSquare2 = new ArrayList<Square>();
//        List<? super Square> squareCircle2 = new ArrayList<Circle>();
        List<? super Square> squareShape2 = new ArrayList<Shape>();

        List<String> test = Arrays.asList("1", "2", "3");
        boolean b = test instanceof ArrayList;

//        test.add("4");
//        List<String> test2 = List.of("1", "2", "3");
//        test2.add("4");
        Deque<String> deque = new ArrayDeque<>();
//        deque.offer(null);
//        deque.offerFirst(null);
//        deque.offerLast(null);
        deque.pollFirst();
        deque.offerFirst(null);
        deque.peekFirst();
        Set<String> sets = new HashSet<>();

        sets.add("");

        String[] arr = {"Tea","Cake"};
        List<String> texts = Arrays.asList(arr);
        texts.set(0, "COdf");


        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                while (true) {
                    System.out.println("Mostrando shapes...");
                    shapesCircle.forEach(System.out::println);
                    TimeUnit.SECONDS.sleep(3);
                }
            }
        }).start();

        TimeUnit.SECONDS.sleep(3);
        sourceList.add(new Circle());
        sourceList.add(new Circle());

        TimeUnit.SECONDS.sleep(4);
        circles2.add(new Circle());

        //shapes.add(new Shape()); // Is read-only
    }
}

class Circle extends Shape {

}

class Square extends Shape {

}

class Shape {

}