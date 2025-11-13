public class Calculator {

    public static double calculate(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    return -1;
                }

        }
        return 0;
    }

    /*public static void whileCalculator() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Hello in the while calculator!\nType 1th number: ");
            double a = sc.nextDouble();
            System.out.print("Type 2th number: ");
            double b = sc.nextDouble();
            System.out.print("Type operator(+, -, *, /): ");
            char op = sc.next().charAt(0);

            double res = calculate(a, b, op);
            System.out.println("Result is " + res);
            System.out.println("Do you want to exit?(enter=no, else=yes): ");
            String exit = sc.nextLine();
            if (!exit.isEmpty()) break;
        }}*/
}
