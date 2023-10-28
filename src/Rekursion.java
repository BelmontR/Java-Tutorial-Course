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

}
