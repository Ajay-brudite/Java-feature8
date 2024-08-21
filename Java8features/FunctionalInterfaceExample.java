package Java8features;

@FunctionalInterface
interface Greeting {
    void greet(String name);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        Greeting greeting = name -> System.out.println("Hello, " + name + "!");
        
        // Calling the greet method
        greeting.greet("Alice");
    }
}
