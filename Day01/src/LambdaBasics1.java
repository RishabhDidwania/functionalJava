public class LambdaBasics1 {
    public static void main(String[] args){
        Greetings oldStyle = new GreetingsImpl();
        oldStyle.hi("Rishabh");

        Greetings newStyle = new Greetings() {
            @Override
            public void hi(String name) {
                System.out.println("Hi "+ name);
            }
        };
        newStyle.hi("Rishabh");


        //Lambda expression
        //anonymous inner class generated during runtime
        //implementations of interfaces with ONE abstract method
        Greetings greetingsObj = name -> System.out.println("Hello From lambda "+name);
        greetingsObj.hi("rishabh");

    }



}
interface Greetings{
    void hi(String name);
}
class GreetingsImpl implements Greetings {
    public void hi(String name){
        System.out.println("Hello "+ name);
    }
}
