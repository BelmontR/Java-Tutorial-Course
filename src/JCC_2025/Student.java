package JCC_2025;

/*
Beispielcode für den Java Crashkurs 2025
Dieser Code wurde vor den Live Sessions erstellt. Der Code der Live Sessions basiert auf ihm
 */
public class Student {

    private int alter;
    private double ECTS;
    public char geschlecht;
    private String name;
    public String studiengang;
    public boolean fsiMitglied = true;
    public int mtrNr;
    public int semester;

    int [] noten = new int[25];
    String[] module = new String[25];
    private boolean immatrikuliert = true;


    public static void main(String[] args)
    {
        int alter = 22;
        double ECTS = 180.5;
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
        double temp2 = alter * ECTS;
        System.out.println(temp2);

        temp = (int)(alter * ECTS);
        System.out.println(temp);

        boolean wahrheitsbelegung = true;
        wahrheitsbelegung = false;

        wahrheitsbelegung = 5 > 3; //5 ist größer als 3 -> true
        wahrheitsbelegung = (alter+1) < alter; //alter +1 ist (fast) immer größer alt alter -> (fast immer) false

        System.out.println((int) geschlecht);
        System.out.println(geschlecht);

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
        durchschnitt = 0;

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
                System.out.println("Hallo Ex-Cheffe, was geht was steht?");
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

        //==================================================

        int count = 0;
        while(count < noten.length){
            if(noten.length == module.length){
                System.out.println(module[count] + ": " + noten[count]);
            }
            else {
                System.out.println(noten[count]);
            }

            count ++;
        }



        count = 0;
        while(count < noten.length){
            durchschnitt += noten[count];
            count ++;
        }


        durchschnitt /= noten.length;
        System.out.println("Notendurchschnitt: " + durchschnitt);
        durchschnitt = 0;


        for(int i = 0; i < noten.length; i++){
            durchschnitt += noten[i];
        }


        durchschnitt /= noten.length;
        System.out.println("Notendurchschnitt: " + durchschnitt);
        durchschnitt = 0;


        for(int i : noten){
            durchschnitt += i;
        }

        durchschnitt /= noten.length;
        System.out.println("Notendurchschnitt: " + durchschnitt);
        durchschnitt = 0;

        //========================================================================

        //durchschnitt = berechneNotendurchschnitt(noten);
        //System.out.println("Notendurchschnitt: " + durchschnitt);

        //========================================================================

        //========== Objektorientierung ==========

        Student rene = new Student(22, 'm', "Rene", "Informatik Master", 1);
        Student andereStudi = new Student(19, 'w', "CoolerName", "Winf Bachelor", 2);

        int[] n = {1,3,2,1,2,1};
        String[] m = {"AuD", "UuU", "Bise", "KonzMod", "SoSy", "BPM"};

        for(int i = 0; i < n.length; i++)
        {
            rene.noteEintragen(n[i], m[i]);
        }

        rene.druckeNoten();
        float ndurch = rene.berechneNotendurchschnitt();
        System.out.println(ndurch);
    }

    public float berechneNotendurchschnitt(int[] noten){
        float res = 0;
        int count = 0;
        for(int note : noten){
            res += note;
            if(note > 0){
                count++;
            }
        }
        return (res / count);
    }

    public float berechneNotendurchschnitt(){
        float res = 0;
        int count = 0;
        for(int note : noten){
            res += note;
            if(note > 0){
                count++;
            }
        }
        return (res / count);
    }

    public Student(int alter, char geschlecht, String name, String studiengang, int mtr){
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.name = name;
        this.studiengang = studiengang;
        this.mtrNr = mtr;

        ECTS = 0;
        semester = 1;
        fsiMitglied = false;
        immatrikuliert = true;
    }

    public void druckeNoten(int[] noten, String[] module){
        for(int i = 0; i < noten.length; i++){
            System.out.println(module[i] +" : " + noten[i]);
        }
    }

    public void druckeNoten(){
        for(int i = 0; i < noten.length; i++){
            System.out.println(module[i] +" : " + noten[i]);
        }
    }

    public void setStudiengang(String neuerStudiengang){
        studiengang = neuerStudiengang;
    }

    public String getName(){
        return name;
    }

    public boolean addECTS(double ectsBonus){
        ECTS += ectsBonus;
        if(ECTS >= 180){
            System.out.println("Glückwunsch, sie haben ihr Studium abgeschlossen!");
            System.out.println("Gut gemacht, " + name);
            immatrikuliert = false;
            studiengang = "Kein Student";

            return true;
        }

        return false;
    }

    public double getECTS(){
        return ECTS;
    }

    public void setNotenUndModule(int[] noten, String[] module){
        this.noten = noten;
        this.module = module;
    }

    public void noteEintragen(int note, String modul){
        for(int i = 0; i <= noten.length; i++){
            if(module[i] == null){
                noten[i] = note;
                module[i] = modul;
                break; //Killt den Loop
            }
        }
    }

    public void notenEintragen(int noten[], String[] module)
    {
        for(int i = 0; i < noten.length; i++){
            noteEintragen(noten[i], module[i]);

            if(!addECTS(5)){
                break;
            }
        }
    }

    //Zu kompliziert für den Kurs
    //Nimmt an, dass das Noten Array immer voll ist
    /*
    public void notenEintragen(int[] noten, String[] module){
        if(this.noten.length <= 0){
            this.noten = noten;
            this.module = module;
        }
        else{
            int newLength = this.noten.length + noten.length;
            int[] newNoten = new int[newLength];
            String[] newModule = new String[newLength];

            boolean oldArrayDone = false;

            for(int i = 0, j = 0; i < newNoten.length; i++, j++){

                if(!oldArrayDone){
                    newNoten[i] = this.noten[j];
                    newModule[i] = this.module[j];
                    if(j >= this.noten.length -1){
                        oldArrayDone = true;
                        j = -1;
                    }
                }
                else{
                    newNoten[i] = noten[j];
                    newModule[i] = module[j];
                }

            }
            this.noten = newNoten;
            this.module = newModule;
        }

    }

     */





}
