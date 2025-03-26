public class Product {

    private String name;
    private int price;
    private int count;

    public Product(String name){
        if(name != null) {
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name != null) {
            this.name = name;
        }
    }
}
