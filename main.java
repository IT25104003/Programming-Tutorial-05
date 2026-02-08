class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int square(int a) {
        return a * a;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)²
        int expr1 = calc.square(calc.add(calc.multiply(3, 4), calc.multiply(5, 7)));
        System.out.println("(3 * 4 + 5 * 7)² = " + expr1);

        // Expression 2: (4 + 7)² + (8 + 3)²
        int expr2 = calc.add(calc.square(calc.add(4, 7)), calc.square(calc.add(8, 3)));
        System.out.println("(4 + 7)² + (8 + 3)² = " + expr2);
    }
}
