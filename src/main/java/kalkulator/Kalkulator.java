package kalkulator;

import java.util.Scanner;

/**
 * Created by slucham-psa-jak-gra on 6/29/16.
 */
public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj: ");
        String expr = in.nextLine();
        String[] arr = expr.split(" ");
        long n1 = Long.parseLong(arr[0]);
        String operator = arr[1];
        long n2 = Long.parseLong(arr[2]);
        long result = 0;
        if (operator.equals("+")) {
            result = n1 + n2;
        }
        else if (operator.equals("-")) {
            result = n1 - n2;
        }
        else if (operator.equals("*")) {
            result = n1 * n2;
        }
        else if (operator.equals("/")) {
            result = n1 / n2;
        }
        System.out.println("Wynik: " + result);
    }
}
