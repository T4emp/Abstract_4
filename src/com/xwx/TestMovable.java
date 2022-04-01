package com.xwx;

public class TestMovable {
    public static void main() {
        Movable m1 = new MovablePoint(5, 6, 10, 12);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovablePoint(2, 1, 2, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
