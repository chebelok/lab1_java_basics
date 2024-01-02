package org.example;

import java.util.Scanner;

public class Calculation {
    static void startCalculate() throws Exception {
        int a = Input( "a");
        int b = Input("b");
        int n = Input("n");
        int m = Input("m");
        int Constanta = 2;
        double finalRes = Calculate(a,b,n,m, Constanta);
        System.out.println(finalRes);
    }

    static int Input(String coef){
        boolean correct = false;
        String tmp;
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while(!correct){
            try {
                System.out.println("Please enter random integer coefficient " + coef);
                tmp = scan.nextLine();
                num = Integer.parseInt(tmp);
                correct = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter integer number ");
            }
        }
        return num;
    }

    static double Calculate(int a, int b, int n, int m, int Constanta) throws Exception{

        if(a > n || b > m ){
            throw new IllegalArgumentException("Lower coefficient can not be greater than Upper oefficient");
        }
        double mainResult = 0;
        for (char i = (char) a; i <= n; i++) {
            double tempResult = 0;
            for (char j = (char) b; j <= m; j++) {
                if(j == 0){
                    throw new Exception("Can not divide for zero");
                }
                if ((j + Constanta) == 0){
                    throw new Exception("Can not divide for zero");
                }
                double upper = (double) i / (double) j;
                double lower = (double) j + (double) Constanta;
                tempResult += (upper/lower);
            }
            mainResult += tempResult;
        }
        System.out.println(mainResult);
        return mainResult;
    }

}
