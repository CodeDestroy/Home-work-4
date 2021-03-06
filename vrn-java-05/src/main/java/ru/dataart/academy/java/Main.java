package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        ReverseInteger reverseInteger = new ReverseInteger();
        try{
            System.out.println("Reverse integer works: " + reverseInteger.reverse(-456));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Reverse integer works for big negative value: " + reverseInteger.reverse(-2147483648));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Reverse integer works for big positive value: " + reverseInteger.reverse(-2147483647));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}