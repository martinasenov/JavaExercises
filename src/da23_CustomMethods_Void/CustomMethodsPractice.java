package da23_CustomMethods_Void;

public class CustomMethodsPractice {




    //create a function that can print hello world 5 times
    public static void helloWorld5Times(){


        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");
        }


    }
    // create a function that can print Cydeo 5 times
    public static void helloCydeo5times(){

        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    //create a function that can print all the eve numbers from 1-10
    public static void evenNumbers(){

        for (int i = 1; i <=10 ; i++) {

            if (i%2==0){
                System.out.println(i);
            }
        }

    }




    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("-------------");
        helloCydeo5times();
        System.out.println("-------------");
        evenNumbers();

    }

}
