package homework3;

public class MainEx1 {

    public class Calculator {
    /*
     * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
     *  sum(), multiply(), divide(), subtract(). 
     * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция. 
     * Методы должны возвращать результат своей работы.
     */
        public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
        }

        public static <T extends Number> double multiply(T a, T b) {
            return a.doubleValue() * b.doubleValue();
        }

        public static <T extends Number> double divide(T a, T b) {
            return a.doubleValue() / b.doubleValue();
        }

        public static <T extends Number> double subtract(T a, T b) {
            return a.doubleValue() - b.doubleValue();
        }
    }

    public static void main(String[] args) {
        System.out.println(Calculator.sum(5, 4.5));
        System.out.println(Calculator.divide(4.4, 0.2));
        System.out.println(Calculator.multiply(2, 2.5));
        System.out.println(Calculator.subtract(6, 4.5));
    }
    
}


