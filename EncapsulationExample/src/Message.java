public class Message {

    private String text;
    String author;
    String createdAt;
    String destination;

    public String getText(){
        if(text == null){
            text = "????";
        }

        return text;
    }

    public void setText(String text){
        if(text.equals("oooo")){
            System.err.println("Invalid message!!!");
        }else {
            this.text = text;
        }
    }

    public void send(){
        System.out.println("message is : " + getText());
    }
}
