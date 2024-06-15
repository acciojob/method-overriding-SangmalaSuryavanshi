package com.driver;

public class Main {
    //int a;

    public static void main(String args[]) {
        B b = new B();
        b.meth();
    }
        public static class A {
            public static String meth() {
                return "Invoking method from class A";
            }
        }//abc
        public static class B extends A {
            public static String meth() {
                return "Method is overridden in Extendend class B";
            }
        }
    }
