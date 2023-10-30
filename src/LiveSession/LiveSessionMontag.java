package LiveSession;

public class LiveSessionMontag {

    public static int zahl = 1;
    private static int geheimeZahl = 7;
    public static double zahl2 = 4.7;

    public static String name = "Rene";
    public static char zeichen = '!';
    public static int zeichen2 = 33;

    public static boolean montag = true;


    public LiveSessionMontag()
    {

    }

    public static void main(String[] args)
    {
        LiveSessionMontag lsm = new LiveSessionMontag();

        double rechnung = zahl + zahl2;
        zahl ++;
        zahl += 1;
        zahl = zahl +1;

        zahl += geheimeZahl;

        zahl *= zahl;
        zahl -= zahl;
        zahl ++;
        zahl /= zahl;

        String message = name + " " + zeichen;

        boolean b1 = zahl == 1; //zahl == 1 mit zahl > 1 ist gleichbedeutend mit false

        String[] array = new String[3];
        array[0] = "Was anderes";

        montag = true;
        name += "a";

        if(name.equals("Rene")){ // name == "Rene"
            System.out.println("Ah, Rene, willkommen");
        }
        else if(name.equals("Renee"))
        {
            System.out.println("Oh, du hast wohl deinen Namen falsch geschrieben, passiert");
        }
        else{
            System.out.println("Wer bist du und was machst du an diesem Computer");
        }

        System.out.println(array[0]);

        int i = 0;
        while(montag)
        {
            i++;
            //System.out.println(i);
            if(i > 10)
            {
                montag = false;
            }
        }

        while(i <= 10)
        {
            System.out.println(i);
        }

        int x = 0;
        while ((char) x != zeichen)
        {
            x++;
            //x+=1;
            //x = x +1;
        }
        //System.out.println(x);

        int[] beispielArray = {5,9,12,90,5456,231,4,23,1,2,1};

        System.out.println("Länge von beispielArray = " + " " + beispielArray.length);

        int cummu = 0;
        for(int n = 0; n < beispielArray.length; n++)
        {
            //cummu += beispielArray[n];
            //System.out.println(beispielArray[n]);
        }

        int zaehler = 0;
        while(zaehler < beispielArray.length)
        {
            //cummu += beispielArray[zaehler];
            zaehler ++;
        }

        for(int element : beispielArray)
        {
            cummu += element;
        }

        System.out.println(cummu);

        //Ganz oben: geheimeZahl = 7;

        System.out.println("Geheime Zahl: " + lsm.getGeheimeZahl()); //-> 7
        System.out.println("Kummuliertes Array: " + lsm.cummulateArray(beispielArray));

        lsm.setGeheimeZahl(100); //gehimeZahl = 100
        geheimeZahl = 100;

        System.out.println("Geheime Zahl: " + lsm.getGeheimeZahl()); //-> 100

        //int temp = cummulateArray(beispielArray);

        System.out.println("Fakultät von 10: " + lsm.fakRec(10));
        System.out.println("Fakultät von 10: " + lsm.fakIter(10));

    }

    public int getGeheimeZahl(){
        return geheimeZahl;
    }

    public void setGeheimeZahl(int zahl){
        geheimeZahl = zahl;
    }

    //Kummuliert alle Werte eines Arrays und gibt den kummulierten Wert zurück
    public int cummulateArray(int[] array)
    {
        int result = 0;
        for(int element : array)
        {
            result += element;
        }
        return result;
    }

    //5! = 5*4*3*2*1
    public long fakRec(int input)
    {
        if(input == 1){
            return 1;
        }
        else{
            return input * fakRec(input -1);
        }
    }

    public long fakIter(int input)
    {
        long result = input;
        for(int i = 2; i < input; i++){
            result = (result *i);
        }
        return result;
    }

}
