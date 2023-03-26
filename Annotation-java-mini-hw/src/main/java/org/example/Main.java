package org.example;

public class Main {
    public static void main(String[] args) {
        CalculatorTests calculatorTests = new CalculatorTests();
        for (java.lang.reflect.Method method : CalculatorTests.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CalcTestsMethod.class)) {
                String testName = method.getAnnotation(CalcTestsMethod.class).value();
                System.out.println("Running test: " + testName);
                try {
                    method.invoke(calculatorTests);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
