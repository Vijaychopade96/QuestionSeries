package ProgrammingQ4.InnerAndAnoy;

public class AnonymousClassExample {
    public static void main(String[] args) {

        Greeting gert=new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from AnonymousClass");

            }
        };
        gert.greet();

    }
}
