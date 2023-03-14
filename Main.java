public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // метод не работал т.к. деление целого числа
        // на ноль приведет к исключению ArithmeticException.

        calc.println.accept(c);


        int d = calc.multiply.apply(a, b);
        calc.println.accept(d);

        System.out.println(calc.pow.apply(a));
        System.out.println(calc.abs.apply(c));
        System.out.println(calc.isPositive.test(a));


    }
}