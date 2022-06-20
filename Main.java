package lessonNum2;

public class Main {
    public static void main(String[] args) {
    // main homework (result)
        System.out.println(ageAndTemp( generateRandomAge(),10));
        System.out.println(ageAndTemp( generateRandomAge(),27));
        System.out.println(ageAndTemp( generateRandomAge(),-10));
        System.out.println(ageAndTemp( generateRandomAge(),15));
        System.out.println(ageAndTemp( generateRandomAge(),-20));

    }
    // generate random age(addition homework)
    public static int generateRandomAge(){

        return (int) (Math.random() * 101);// Age from 0 to 100
    }
    // main task (algorithm)
    public static String ageAndTemp( int age , int temp) {

        boolean CanYouOut = false;
        String replyCanYouOut;

        //block 1

        if ((age > 20 && age < 45)
                && (temp > -20 && temp < 30) )  CanYouOut = true;
        //block 2

        if (age < 20 && temp > 0 && temp < 28) CanYouOut = true;

        //block 3

        if (age > 45 && temp > -10 && temp < 25) CanYouOut = true;

        // you can walk or not

        if (CanYouOut) {
            replyCanYouOut = "Можно идти гулять\n";

        } else {
            replyCanYouOut = "Оставайтесь дома\n";
        }
        return replyCanYouOut;

    }
}