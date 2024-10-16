package JCC_2023.LiveSessionThursday;

public class Student {

    private int age;
    private String name;
    public String mtknr; //Matrikelnummer
    private char gender; //m oder w
    public int semester;
    public boolean immatrikuliert;
    public int credits; //max. 180

    public String[] passedModules;

    //public int[] test = {1,4,7,34,90,73,2,8,34,3,1,2,2,1,2,1,1,1,1,8,53,34,2,546,4};

    public Student(int age, String name, char gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
        semester = 1;
        credits = 0;
        passedModules = new String[30];
        immatrikuliert = true;
        mtknr = "Kenn ich nicht auswendig";
    }

    /*
    public static void main(String[] args)
    {

        if(immatrikuliert) { //immatrikuliert == true
            passedModules[0] = "Win Projektwoche";
            //System.out.println(passedModules[0]);
        }
        else if(!immatrikuliert){ //immatrikuliert == false
            //System.out.println("Geh studieren! Dangge");
        }


        System.out.println(cummulateArray(test));
        int[] x = new int[70];
        System.out.println(cummulateArray(x));
        //setAge(22);
        //System.out.println(getAge());
        // !true = false und !false = true

        //test ist ein int[]

        //int myArray[] = new int[10];

        /*
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = i;
            System.out.println(myArray[i]);
        }

        int i = 0;
        for(int element : myArray){
            element = i;
            System.out.println(element);
            i++;
        }
         */

        /*
        int counter = 0;
        while(counter < test.length){
            System.out.println(test[counter]);
            counter ++;
        }

        System.out.println("______");

        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }

        System.out.println("______");

        for(int element : test){
            System.out.println(element);
        }
        /*

        /*
        int counter = 0;
        while(counter < age){
            System.out.println(counter);
            counter ++;
        }

        System.out.println("----------------");

        for(int i = 0; i<age; i++) {
            System.out.println(i);
        }


          /*
        if(immatrikuliert == true) {
            passedModules[0] = "Win Projektwoche";
        }
        else if(name.equals("Rene")){ // name == "Rene"
            immatrikuliert = true;
            System.out.println(immatrikuliert);
        }
        else if(age == 21){
            System.out.println(age + " ist ein " + "cooles Alter, weiter so!");
        }
        else{
            System.out.println("Geh studieren! Dangge");
        }
        */
  //  }

    public void printData(){
        System.out.println("--------");
        System.out.println(name);
        System.out.println(age);
        System.out.println(mtknr);
        System.out.println(immatrikuliert);
        System.out.println(gender);
        System.out.println(credits);
        System.out.println(semester);
        System.out.println("--------");
    }

    public void setAge(int newAge){
        age = newAge;
        //printData();
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void newSemester(){
        semester ++;
        credits += 30;
        //passedMdules hinzufügen, machen wir aber nicht
        if(semester % 2 == 1){
            age ++;
        }

        if(semester > 8 || credits == 180){
            immatrikuliert = false;
        }
    }

    /*
    public int cummulateArray(int[] array){
        int result = 0;
        for(int element : array){
            result += element;
        }
        return result;
    }
     */

}
