public class Main {

    public static void main(String[] args){

        Product p1 = new Product("iPhone");

        System.out.println(p1.getName());

        p1.setName("Samsung");



        Message m1 = new Message();
        m1.author = "Ali";
        m1.createdAt = "2025-03-12 23:45:56";
        m1.setText("oooo");

        m1.send();
    }
}
