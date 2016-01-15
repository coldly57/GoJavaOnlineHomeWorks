package module4;

import java.util.Random;
import java.util.Scanner;

public class IntegralMonteCarlo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int accuracy;

        System.out.println("Please enter lower integration limit a:");
        a = sc.nextInt();
        System.out.println("Please enter upper integration limit b:");
        b = sc.nextInt();
        System.out.println("Please enter accuracy (can't be negative or 0):");
        accuracy = sc.nextInt();

        while (accuracy <= 0){
            System.out.println("You have entered incorrect accuracy. Please repeat (can't be negative or 0):");
            accuracy = sc.nextInt();
        }

        IntegralMonteCarlo.calculateIntegral(a, b, accuracy);
    }

    public static void calculateIntegral(int a, int b, int accuracy){

        Random rnd = new Random();

        double functionSumXSquare = 0;
        double functionSumOneDevX = 0;
        double functionSumAPowX = 0;
        double functionSumExpPowX = 0;
        double functionSumSinX = 0;
        double functionSumCosX = 0;

        int N = accuracy;

        while (N > 0){
            double x = a + (b - a) * rnd.nextDouble();
            functionSumXSquare += Math.pow(x, 2);
            functionSumOneDevX += 1 / x;
            functionSumAPowX += Math.pow(a, x);
            functionSumExpPowX += Math.pow(Math.E, x);
            functionSumSinX += Math.sin(x);
            functionSumCosX += Math.cos(x);

            N--;
        }

        double integralXSquare = (b - a) * (functionSumXSquare / accuracy);
        double integralOneDevX = (b - a) * (functionSumOneDevX / accuracy);
        double integralAPowX = (b - a) * (functionSumAPowX / accuracy);
        double integralExpPowX = (b - a) * (functionSumExpPowX / accuracy);
        double integralSinX = (b - a) * (functionSumSinX / accuracy);
        double integralCosX = (b - a) * (functionSumCosX / accuracy);

        System.out.printf("Defined integral with integrand x^2 equals %.3f \n", integralXSquare);
        System.out.printf("Defined integral with integrand 1/x equals %.3f \n", integralOneDevX);
        System.out.printf("Defined integral with integrand a^x equals %.3f \n", integralAPowX);
        System.out.printf("Defined integral with integrand e^x equals %.3f \n", integralExpPowX);
        System.out.printf("Defined integral with integrand sin(x) equals %.3f \n", integralSinX);
        System.out.printf("Defined integral with integrand cos(x) equals %.3f \n", integralCosX);

    }
}