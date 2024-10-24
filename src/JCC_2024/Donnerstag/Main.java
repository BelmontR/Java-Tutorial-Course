package JCC_2024.Donnerstag;

public class Main {

    public static void main(String[] args)
    {
        FAUStudent studi1 = new FAUStudent("Rene", 22, 'm', "Informatik Master", 1.93f);
        int[] noten = {1,3,2};
        String[] module = {"AuD", "UuU", "BISE"};
        studi1.setNotenundModule(noten, module);

        System.out.println(studi1.getName());
        System.out.println(studi1.berechneDurchschnitt());

        System.out.println(" ");

        FAUStudent studi2 = new FAUStudent("Lana", 16, 'w', "Wirtschaftsinformatik Bachelor", 1.93f);
        int[] noten1 = {1,1,2};
        String[] module1 = {"AuD", "UuU", "BISE"};
        studi2.setNotenundModule(noten1, module1);

        System.out.println(studi2.getName());
        System.out.println(studi2.berechneDurchschnitt());





    }
}
