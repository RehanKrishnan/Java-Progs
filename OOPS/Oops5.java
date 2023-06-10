package OOPS;

class Oops5 {

    public int divideNumbers(int x, int y) {
        int division = x / y;
        return division;
    }

    public static void main(String[] args) {

        int Num1 = 7;
        int Num2 = 7;
        Oops5 obj = new Oops5();
        int result = obj.divideNumbers(Num1, Num2);
        System.out.println("Dividing " + Num1 + " by " + Num2 + " equals: " + result);
    }
}