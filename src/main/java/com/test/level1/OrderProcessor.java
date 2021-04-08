package com.test.level1;

import com.test.OrderTest;

public class OrderProcessor extends OrderTest {

    public static void main(String[] args) {
        OrderTest ot = new OrderTest();
        OrderTest.PublicItemTest m1;
    }

    public void test(Object o) {
        if (o instanceof ProtectedItemTest) {
            System.out.println("I can see it.");
        }
    }
}
