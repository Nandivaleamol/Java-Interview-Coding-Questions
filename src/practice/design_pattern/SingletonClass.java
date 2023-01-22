package practice.design_pattern;

import java.util.ArrayList;

public final class SingletonClass {

    public static SingletonClass instance = new SingletonClass();

    private SingletonClass(){
    }

    public static SingletonClass getSingletonClassObject(){
        return instance;
    }
}

class Test{
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getSingletonClassObject();
        SingletonClass s2 = SingletonClass.getSingletonClassObject();

        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName());

        System.out.println(s1==s2);

    }
}
