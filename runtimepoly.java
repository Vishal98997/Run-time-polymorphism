class language{
    public void greetings(){

    }
}
class hindi extends language{
    public void greetings(){
        System.out.println("suprabhat...");
    }
}
class english extends language{
    public void greetings(){
        System.out.println("Good morning...");
    }
}
class french extends language{
    public void greetings(){
        System.out.println("Bon Jour...");
    }
}
public class runtimepoly {
    public static void main(String[] args) {
        //non polymorphic 
        // hindi h=new hindi();
        // h.greetings();
        // english en=new english();
        // en.greetings();
        // french fn=new french();
        // fn.greetings();

        // polymorphic approach
        language ln;
        ln=new hindi();
        ln.greetings();
        ln=new english();
        ln.greetings();
        ln=new french();
        ln.greetings();
    }
}
