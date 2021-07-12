package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Point2DTest {

    public static void main(String[] args) {
        List<Point2D> point2DS = new ArrayList<>();
        Point2D point2D = new Point2D();
        point2D.setX(1);
        point2D.setY(3);
        point2DS.add(point2D);
        System.out.println("point2DS"+point2DS);
    }
}
