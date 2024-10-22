package JCC_2024.Dienstag;

public class Main {
    public static int mtrCounter = 0;

    public static void main(String[] args)
    {
        Student[] studis = new Student[2];

        studis[0] = new Student(22, "Rene", 'm', "Info", mtrCounter);
        mtrCounter ++;
        studis[1] = new Student(16, "Lana", 'w', "Winf", mtrCounter);
        mtrCounter ++;

        studis[0].noten[0] = 1;
        studis[0].noten[1] = 2;
        studis[0].module[0] = "AuD";
        studis[0].module[1] = "BISE";

        studis[1].noten[0] = 1;
        studis[1].noten[1] = 1;
        studis[1].module[0] = "AuD";
        studis[1].module[1] = "BISE";

        for(Student s : studis){
            if(s != null) {
                System.out.println(s.getName() + " " + s.mtrNr + " " + s.alter);
                s.berechneNotendurschnitt();
                s.druckeNotenuebersicht();

                System.out.println("===============");

            }
        }
    }
}
