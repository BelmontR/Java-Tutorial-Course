package LiveSessionThursday;

public class MainThursday {


    public static void main(String[] args)
    {
        Student rene = new Student(21,"Rene", 'm');

        Student[] studis = new Student[29];

        for(Student element : studis){
            element = new Student(21,"Rene", 'm');
        }
        studis[0] = new Student(21,"René", 'm');
        studis[1] = new Student(21,"Renee", 'm');

        while(rene.immatrikuliert){
            //rene.printData();
            rene.newSemester();
        }

        System.out.println(fakRec(5));
        System.out.println(fakIter(5));
        System.out.println(fibonacciIter(50));



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
        return input *(fakRec(input -1));
    }

    public long fakRec2(long input){
        if(input == 1){
            return 1;
        }
        return input *(fakRec(input -1));
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
