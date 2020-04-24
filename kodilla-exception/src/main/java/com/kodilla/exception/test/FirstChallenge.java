package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try (double result = firstChallenge.divide(3, 1)) {

        } catch (ArithmeticException ae) {
            System.out.println("It's impossible to divide by 0!");
            return 0;

        } finally {
            System.out.println("Operation finished!");
        }

        System.out.println(result);

    }
}
















