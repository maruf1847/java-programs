package com.basicjava;

public class Strings {
    public static void main(String[] args){
        String name1 = "Marufur Rahman";
        String name2 = "Ridoy Ahmed";
        String name3 = name1 +" "+name2;
        System.out.println(name3);
        //charAt
        // string index value
        System.out.println(name1.charAt(5));
        // string length
        System.out.println(name2.length());
        // last character of name1
        System.out.println(name1.charAt(name1.length()-1));
        // string replace
        String name4 = name2.replace('a','f');
        // substring
        System.out.println(name1.substring(8,14));

    }
}
