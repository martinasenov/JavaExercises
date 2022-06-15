package da23_CustomMethods_Void;

public class CustomMethodsWithParameters {



    //create a function that can check if a number is odd number of even number

    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number+" is even number");
        }else{

            System.out.println(number+" is odd number");
        }

    }

    //create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){

        int age=2022-birthYear;
        System.out.println("age = " + age);
    }

    public static void printNumbers(int x,int y){

        if(x>y) {

            for (int i = y + 1; i < x; i++) {

                System.out.println(i);
            }
        }else{
            for (int i = x + 1; i < y; i++) {

                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {

        oddOrEven(8);

        System.out.println("-------------");

        ageOfPerson(1989);

        System.out.println("-------------");

        printNumbers(38,48);
    }


}
