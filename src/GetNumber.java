import java.util.Scanner;
 class 4GetNumber {
    public static void main(String[] args) {
        Scanner numberScan = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę A:");;
        double a = numberScan.nextDouble();
        numberScan.nextLine();
        System.out.println("Wprowadź znak działania matematycznego: +, -, /, *,");;
        String operator = numberScan.nextLine();
        System.out.println("Wprowadź drugą liczbę B:");;
        double b = numberScan.nextDouble();

        Calculate calc = new Calculate();
        double result = calc.calculate(a, b, operator);
        System.out.println("A" + operator + "B = " + result);
        numberScan.close();
    }
}
