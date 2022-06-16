package day24_CustomMethods_Return;

public class BreakfastTasks {


    //1.Create a method that can display the initials of the person



    public static void initials(String firstName, String lastName){

        System.out.println(firstName+" "+ lastName +"="+  firstName.charAt(0) + lastName.charAt(0));


    }


    public static void domain(String email) {

        String domain = email.substring(email.indexOf("@") + 1,email.lastIndexOf("."));

        System.out.println("domain = " + domain);

    }





    public static void main(String[] args) {


        initials("Martin","Asenov");

        System.out.println("------------------------");

        domain("martin.asenov@gmail.com");

        System.out.println("------------------------");

        String[] emails={"josh@hotmail.com","jim@amazon.com","john@haitec.com","martin@gmail.com","brad@gmail.com"};


        for (String email: emails){

            domain(email);
        }


    }

}
