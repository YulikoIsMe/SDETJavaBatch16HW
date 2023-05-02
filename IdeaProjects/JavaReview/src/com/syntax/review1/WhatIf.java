package com.syntax.review1;

public class WhatIf {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String c="Hello";
        String d="Bye";

        System.out.println(c+d+a+b);//hellobye1020
        System.out.println(c+d+(a+b));
    }
}
