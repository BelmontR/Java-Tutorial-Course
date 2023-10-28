public class Main {

    public static void main(String[] args)
    {
        System.out.println("");
        countRec(5);
    }

    public static void countRec(int i){
        if(i == 0){
            System.out.println("0");
            return;
        }
        System.out.println(i);
        countRec(i -1);
    }

}