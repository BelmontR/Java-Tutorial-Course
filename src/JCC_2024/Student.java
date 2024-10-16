package JCC_2024;

public class Student {


    public static void main(String[] args)
    {
        int alter = 22;
        double groesse = 1.95;
        char geschlecht = 'm';
        String name = "Rene";
        String studiengang = "Informatik (M.Sc)";
        boolean fsiMitglied = true;


        System.out.println(alter);

        //Wert einem Attribut zuordnen
        alter = 22;

        alter += 7; // -> alter = alter + 7;
        alter -= 7; // -> alter = alter - 7;
        alter *= 3; // -> alter = alter * 3;
        alter /= 3; // -> alter = alter / 3;

        alter ++; // -> alter = alter +1;
        alter --; // -> alter = alter -1;

        System.out.println(alter);

        int temp = alter + alter;
        double temp2 = alter * groesse;
        System.out.println(temp2);

        temp = (int)(alter * groesse);
        System.out.println(temp);

        boolean wahrheitsbelegung = true;
        wahrheitsbelegung = false;

        wahrheitsbelegung = 5 > 3; //5 ist größer als 3 -> true
        wahrheitsbelegung = (alter+1) < alter; //alter +1 ist (fast) immer größer alt alter -> (fast immer) false

        System.out.println((int) geschlecht);

        //======================================================

        int [] noten = new int[3];
        //int[] noten = {1,3,2};
        String[] module = new String[3];
        //String[] module = {"AuD", "UuU", "Bise"};

        noten[0] = 1;
        noten[1] = 3;
        noten[2] = 2;

        module[0] = "AuD";
        module[1] = "UuU";
        module[2] = "Bise";



        float durchschnitt = 0;
        durchschnitt += noten[0];
        durchschnitt += noten[1];
        durchschnitt += noten[2];
        durchschnitt /= noten.length;

        System.out.println("Notendurchschnitt:" + durchschnitt);

        noten[1]--;

        durchschnitt = 0;
        durchschnitt += noten[0];
        durchschnitt += noten[1];
        durchschnitt += noten[2];
        durchschnitt /= noten.length;

        System.out.println("Notendurchschnitt:" + durchschnitt);


        //==================================================

        if(name == "Rene"){
            System.out.println("Hallo Rene, na, wie geht's? Alles fit?");
        }
        else if((name == "Rnee") || (name == "Reen") || (name == "Erne") || (name == "Nree")){
            System.out.println("Oh, haha, hallo Rene, hast du deinen Namen falsch geschrieben? Hm, passiert");
        }
        else{
            System.out.println("Wer bist du und was hast du mit Rene gemacht?!?");
        }


        if(fsiMitglied){ // entspricht if(fsiMitglied == true)
            if(name.equals("Rene")){
                System.out.println("Hallo Cheffe, was geht was steht?");
            }
            else {
                System.out.println("Hallo du cooler Mensch");
            }
        }
        else{
            System.out.println("Hallo");
        }


        if(alter <= 0 || (studiengang == " " && name == " ")){
            System.out.println("Irgendwas stimmt hier nicht, deine Daten sind fehlerhaft");
        }

    }

}
