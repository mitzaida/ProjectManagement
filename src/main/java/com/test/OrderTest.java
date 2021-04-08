package com.test;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class OrderTest {

    private String name;
    private PrivateItemTest itemPrivate;
    private PublicItemTest itemPublic;
    private DefaultItemTest itemDefault;
    private ProtectedItemTest itemProtected;

    public OrderTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss").withZone(ZoneId.of("America/Bogota"));
        SimpleDateFormat s = new SimpleDateFormat("HHmmss");
        this.name = "OrderTest " + formatter.format(Instant.now());
        this.itemPrivate = new PrivateItemTest();
        this.itemPublic = new PublicItemTest();
        System.out.println(this.name);
    }

    private static class PrivateItemTest {
        private String name;

        public PrivateItemTest() {
            this.name = "Empty";
        }

        public PrivateItemTest(String name) {
            this.name = name;
        }
    }

    public static class PublicItemTest {
        private String name;

        public PublicItemTest() {
            this.name = "Empty";
        }

        public PublicItemTest(String name) {
            this.name = name;
        }
    }

    protected static class ProtectedItemTest {
        private String name;

        public ProtectedItemTest() {
            this.name = "Empty";
        }

        public ProtectedItemTest(String name) {
            this.name = name;
        }
    }

    static class DefaultItemTest {
        private String name;

        public DefaultItemTest() {
            this.name = "Empty";
        }

        public DefaultItemTest(String name) {
            this.name = name;
        }
    }
}
