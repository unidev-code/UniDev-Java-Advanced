public class Main {

    public static void main(String[] args){

        Person p = new Person();

        Person p1 = new Person("Ali", 24);
        p1.name = "Ahmad";
        p1.age = 34;

        Person p2 = new Person("Reza");

        System.out.println(p1.name);


        Employee e1 = new Employee("Reza");
        e1.printEmployeeInfo();

        Employee e2 = new Employee("Reza", "Ahmadi");
        e2.printEmployeeInfo();

        Employee e3 = new Employee("Reza", "Ahmadi", " Manager");
        e3.printEmployeeInfo();

    }
}
