public class HelloWorld {

    public String printHelloWorld(){

        return "Returns a value";
    }

    private String printPrivateMessage(){

        return "Returns a message";
    }

    public String getPrivateMessage(){
        return printPrivateMessage();
    }

    public HelloWorld() {
    }
}
