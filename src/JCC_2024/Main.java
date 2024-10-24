package JCC_2024;

public class Main {

    public Student[] students;

    public static void main(String[] args)
    {
        System.out.println("Fakultät von 10: " + fakRec(10));
        System.out.println("Fakultät von 10: " + fakIter(10));

        System.out.println("");

        System.out.println("Iterativ: Fibonacci von 20: " + fibonacciIter(20));
        System.out.println("Rekursiv: Fibonacci von 20: " + fib(20));

        System.out.println("");

        System.out.println("Iterativ: Fibonacci vosn 45: " + fibonacciIter(45));
        System.out.println("Rekursiv: Fibonacci von 45: " + fib(45));

        System.out.println("");

        System.out.println("Iterativ: Fibonacci von 70: " + fibonacciIter(70));
        System.out.println("Rekursiv: Fibonacci von 70: " + fib(70));

    }

    //5! = 5 * 4 * 3 * 2 * 1
    //4! = 4 * 3 * 2 * 1
    //3! = 3 * 2 * 1
    //2! = 2 * 1
    //1! = 1
    public static long fakRec(long input){
        if(input == 1){
            return 1;
        }
        return input *(fakRec(input -1)); //fakRec(5) = 5 * fakRec(4) = 5 * 4 * fakRec(3) = 5 * 2 * 3 * fakRec(2) = ...
    }

    public static long fakIter(int input){

        long result = input;
        for(int i = 2; i < input; i++){
            result = (result*i);
        }
        return result;
    }

    //fib(n) = fib(n-1) + fib (n-2)
    public static long fib(long input){
        if(input <= 1){
            return input;
        }
        else{
            return fib(input -1) + fib(input -2);
        }
    }

    public static long fibonacciIter(int input)
    {
        if(input <= 0){
            return 0;
        }
        else if(input == 1){
            return 1;
        }
        else {
            long fib0 = 0;
            long fib1 = 1;
            long fibonacci = 0;

            for (int i = 2; i <= input; i++) {
                fibonacci = fib0 + fib1;
                fib0 = fib1;
                fib1 = fibonacci;
            }

            return fibonacci;
        }
    }
}
