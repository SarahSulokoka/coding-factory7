package gr.aueb.cf.ch1;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int result = 0;

        inputNum = in.nextInt();

        leftDigit = inputNum / 10;
        rightDigit =  inputNum % 10;
        result = leftDigit + rightDigit;

        System.out.printf("Input Num: %d , left digit %d , right digit %d result %d" ,
                inputNum , leftDigit , rightDigit , result );



    }
}
