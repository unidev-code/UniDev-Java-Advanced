public class Main {

    public static void main(String[] args){

        String formatResult1 = String.format("%,d", 2000000);
        print("format result for 2000000 is : " + formatResult1);

        String formatResult2 = String.format("%s %s", "UniDev", "Students");
        print("format result for show texts is : " + formatResult2);

        String formatResult3 = String.format("My name is %s, from %s", "Ali", "Berlin");
        print("format result 3 is : " + formatResult3);

        String formatResult4 = String.format("%d/%02d/%02d %02d:%02d", 1403, 12, 9, 9, 24);
        print("format result for display date is : " + formatResult4);

        String formatResult5 = String.format("Your account number is : %012d", 123);
        print("format result for display account number is : " + formatResult5);

        String formatResult6 = String.format("your point is : %.2f", 18.256785);
        print("format result for display float is : " + formatResult6);



        print("String.format(ex:1) : " + String.format("%s", "Hello"));
        String name = "Ali";
        print("String.format(ex:2) : " + String.format("Hello Dear %s", name));

        print("String.format(ex:3) : " + String.format("I am %s, i have %d years old", name, 23));
        print("String.format(ex:4) : " + String.format("Balance = %,d", 2500000));
        print("String.format(ex:5) : " + String.format("Time is : %02d:%02d", 8,4));
        print("String.format(ex:6) : " + String.format("Time is : %02d:%02d", 11,44));
        print("String.format(ex:7) : " + String.format("%d/%02d/%02d", 1403,12,8));
        print("String.format(ex:8) : " + String.format("%d/%02d/%02d %02d:%02d", 1403,12,8, 3,24));
        print("String.format(ex:9) : " + String.format("Point = %.2f", 18.3446786));

        float[] rates = {3.5f,5,4,2,5,5,4,4.5f};

        float sum= 0;
        for (int i = 0; i < rates.length; i++) {
            sum += rates[i];
        }

        float rate = sum / rates.length;
        print(String.format("⭐ %.1f", rate));
    }

    public static void print(String message){
        System.out.println(message);
    }
}
