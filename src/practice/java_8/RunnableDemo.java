package practice.java_8;

import java.util.List;

//Use a lambda expression to create a thread that prints out "Hello, World!"
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r = ()-> System.out.println("Hello, World!");
        r.run();
    }
}
