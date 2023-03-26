package org.example;

public class CalculatorTests {

    @CalcTestsMethod("add()")
    public void testAdd() {
        Calculator calculator = new Calculator();
        int res = calculator.add(2, 2);
        if (res == 2 + 2) {
            System.out.println("add() method works correctly");
        } else {
            System.out.println("There are some mistakes in implementation of method add()");
        }
    }

    @CalcTestsMethod("div()")
    public void testDiv() {
        Calculator calculator = new Calculator();
        int res = calculator.div(5, 2);
        if (res == 5 / 2) {
            System.out.println("div() method works correctly");
        } else {
            System.out.println("There are some mistakes in implementation of method div()");
        }
    }

    // Допустим, здесь не будет аннотации - следовательно, этот метод не отработает
    public void testMod() {
        Calculator calculator = new Calculator();
        int res = calculator.mod(5, 2);
        if (res == 5 % 2) {
            System.out.println("mod() method works correctly");
        } else {
            System.out.println("There are some mistakes in implementation of method mod()");
        }
    }
}

