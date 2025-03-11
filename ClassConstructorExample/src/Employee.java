public class Employee {

    String firstName;
    String lastName;
    String position;

    public Employee(String firstName){
        this.firstName = firstName;
    }

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, String position){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void printEmployeeInfo(){
        System.out.println(String.format("%s %s, %s", firstName, lastName, position));
    }
}
