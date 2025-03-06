
public class Main {

    public static void main(String[] args) {


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
    }

    public static void print(String message) {
        System.out.println(message);
    }
}