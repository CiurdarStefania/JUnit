package ro.fasttrackit.mvnbase;

public class Calculator {
    public int add(int a, int b) {
        if((long) a+b >= Integer.MAX_VALUE);
        {
            throw new IllegalArgumentException();
        }

    }
    public int minus(int a, int b){
        return a-b;
    }

}
