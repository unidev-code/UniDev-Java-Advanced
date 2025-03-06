
public class Main {

    public static void main(String[] args) {







        /*String sentence = "Hello UniDev Students";

        String[] arrWords = sentence.split(" ");

        String longestWord = "";
        for (int i = 0; i < arrWords.length; i++) {
            if(arrWords[i].length() > longestWord.length()){
                longestWord = arrWords[i];
            }
        }

        print("longest word is : " + longestWord);*/


















        String text = " Hello UniDev Students,Hello ";

        char charAtResult = text.charAt(7);
        System.out.println("charAt result for index=7 is : " + charAtResult);

        String concatResult = text.concat("###").concat("!!!");
        System.out.println("concat result is : " + concatResult);

        String replaceCharResult = text.replace(' ', '-');
        print("replace char result is : " + replaceCharResult);

        String replaceStringResult = text.replace("Hello", "Hi");
        print("replace String result is : " + replaceStringResult);

        int compareToResult = text.compareTo(" hello UniDev Students,Hello ");
        print("compareTo result is = " + compareToResult);

        String substringResult = text.substring(3,8);
        print("substring result is : " + substringResult);

        print("toLowerCase result is : " + text.toLowerCase());
        print("toUpperCase result is : " + text.toUpperCase());

        print("trim result is : " + text.trim());

        boolean containsResult = text.toLowerCase().contains("uniDev".toLowerCase());
        print("contains result is : " + containsResult);

        boolean equalsResult = text.equals(" Hello UniDev Students,Hello");
        print("equals result is : " + equalsResult);


        int indexOfResult = text.indexOf("UniDev");
        print("indexOf result is : " + indexOfResult);

        boolean foundHello = true;
        int fromIndex = 0;

        while (foundHello){
            int helloIndex = text.indexOf("Hello", fromIndex);

            if(helloIndex == -1){
                foundHello = false;
                //break;
            }else{
                print("Hello index = " + helloIndex);
                fromIndex = helloIndex+1;
            }
        }

        String[] arrSplitResult = text.split(" ");
        for (int i = 0; i < arrSplitResult.length; i++) {
            print("split result section " + (i+1) + " : " + arrSplitResult[i]);
        }

        String valueOfResult = String.valueOf(12345);
        print("valueOf result 12345 is : " + valueOfResult);


        String joinResult = String.join(",", "Ali", "Arash", "Hamed");
        print("join result is : " + joinResult);





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

    public static void print(String message) {
        System.out.println(message);
    }
}