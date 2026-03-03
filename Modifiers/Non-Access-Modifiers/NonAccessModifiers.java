
final class FinalClass {
    static int count = 0;
    final String message = "Hello, I am final!";
    FinalClass() {
        count++;
    }

    static void showCount() {
        System.out.println("Objects created: " + count);
    }

    final void showMessage() {
        System.out.println(message);
    }
}

abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class NonAccessModifiers {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        obj1.showMessage();
        FinalClass.showCount();

        Shape s = new Circle();
        s.draw();
    }
}
