import problem.Calculator;

public class Main {
    public static void main(String args[]){
        Calculator c = new Calculator();
        int sum = c.add(10,5);
        int product = c.multiply(3, 9);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}