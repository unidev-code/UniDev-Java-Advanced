
public class Main {

    public static void main(String[] args) {

        String text = " Hello UniDev Students,Hello ";

        char c = text.charAt(5);
        System.out.println("result of charAt is : " + c);

        String concatResult = text.concat("!!!");
        System.out.println("result of concat is : " + concatResult);

        String replaceCharResult = text.replace(' ', '-');
        System.out.println("result of replace char is : " + replaceCharResult);

        String replaceStringResult = text.replace("Hello", "Hi");
        System.out.println("result of replace string is : " + replaceStringResult);

        int compareToResult = text.compareTo(" Hello UniDev students");
        System.out.println("result of compareTo is : " + compareToResult);

        String substringResult = text.substring(0,5);
        System.out.println("result of substring 0,5 is : " + substringResult);

        String toLowerCaseResult = text.toLowerCase();
        print("result of toLowerCase is : " + toLowerCaseResult);

        String toUpperCaseResult = text.toUpperCase();
        print("result of toUpperCase is : " + toUpperCaseResult);

        String trimResult = text.trim();
        print("result of trim is : " + trimResult);

        boolean containsResult = text.contains("UniDev");
        print("result of contains is : " + containsResult);

        boolean equalsResult = text.equals("UniDev");
        print("result of equals is : " + equalsResult);
    }

    public static void print(String message) {
        System.out.println(message);
    }
}