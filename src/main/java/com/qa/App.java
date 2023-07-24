package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Hello World!"));
        System.out.println(sayHelloToSomeone("Hello Alice"));
        System.out.println(sayHelloToSomeone("Hello Bob"));
        System.out.println(sayHelloToSomeone("Hello Charlie"));
	System.out.println(sayHelloToSomeone("Hello Tom"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
