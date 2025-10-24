package JCC_2025.Freitag;

public class Main {

    public static void main(String[] args) {
        FAUStudent studi1 = new FAUStudent("Rene", 23, 'm', "Informatik");
        FAUStudent studi2 = new FAUStudent("Kevin", 19, 'm', "WInf");
        FAUStudent studi3 = new FAUStudent("Lana", 19, 'w', "WInf");

        studi1.noten = new int[]{1, 1, 2, 1, 3};
        studi1.BerechneEigenenNotendurchschnitt();
        studi1.Informationsaussgabe();

        studi2.noten = new int[]{3,3,3,2,1,2,1,2,3,3,4};
        studi2.BerechneEigenenNotendurchschnitt();

        studi3.noten = new int[]{1,1,1,2,2};
        studi3.BerechneEigenenNotendurchschnitt();

        System.out.println("---");
        studi1.NeuesSemester();
        studi1.Informationsaussgabe();
    }

}
