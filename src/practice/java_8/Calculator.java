package practice.java_8;

//Create a functional interface for a simple calculator that takes two integers and returns their sum.
@FunctionalInterface
public interface Calculator {
    long sum(int i1, int i2);
}

class Test{
    public static void main(String[] args) {

        // 1st Approach
        Calculator c1 = (i1,i2)->i1+i2;
        long sum1 = c1.sum(10, 20);
        System.out.println(sum1);

        // 2nd Approach
        Calculator c2 = Integer::sum;
        long sum2 = c2.sum(10, 20);
        System.out.println(sum2);
    }
}
