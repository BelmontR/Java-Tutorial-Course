package JCC_2023;

public class Rekursion {

    public static void main(String[] args)
    {
        System.out.println(fakIter(1));
    }

    public static long fakIter(int input)
    {
        long result = input;
        for(int i = 2; i  < input; i++)
        {
            result = (result * i);
        }
        return result;

    }

    public static long fakRec(int input)
    {
        if(input == 1)
        {
            return 1;
        }
        return input *fakRec(input-1);
    }

    //fib(n) = fib(n-1) + fib (n-2)

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

    public static long fibonacciRec(int input)
    {
        if(input <= 1){
            return input;
        }
        else{
            return fibonacciRec(input -1) + fibonacciRec(input -2);
        }
    }

}
