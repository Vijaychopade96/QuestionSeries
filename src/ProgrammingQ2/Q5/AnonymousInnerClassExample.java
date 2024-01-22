package ProgrammingQ2.Q5;

// Define an interface
interface Greeting {
    void greet();
}

// Another class that uses the interface
class GreetingHandler {
    // Method that takes an object of the Greeting interface
    public void handleGreeting(Greeting greeting) {
        greeting.greet();
    }
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        // Create an instance of GreetingHandler
        GreetingHandler handler = new GreetingHandler();

        // Use an anonymous inner class to implement the Greeting interface
        handler.handleGreeting(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from the anonymous inner class!");
            }
        });
    }
}

