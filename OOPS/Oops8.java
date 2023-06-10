package OOPS;

class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    String add(String str1, String str2) {
        return str1 + str2;
    }
}

class Oops8 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(14, 10);
        System.out.println("Sum: " + sum1);

        String result = calculator.add("Welcome To ", "MTECH INTEGRATED COURSE");
        System.out.println("Concatenated String: " + result);
    }
}
