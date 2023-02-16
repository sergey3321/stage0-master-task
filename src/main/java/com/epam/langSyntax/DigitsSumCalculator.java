package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String forConvertNumber1 = String.valueOf(number);
        char extractNumber1 = forConvertNumber1.charAt(0);
        String valueSimbol1 = String.valueOf(extractNumber1);
        int forSumNumber1 = Integer.parseInt(valueSimbol1);
        String forConvertNumber2 = String.valueOf(number);
        char extractSimbol2 = forConvertNumber2.charAt(1);
        String valueSimbol2 = String.valueOf(extractSimbol2);
        int forSumNumber2 = Integer.parseInt(valueSimbol2);
        String forConvertNumbers3 = String.valueOf(number);
        char extractSimbol3 = forConvertNumbers3.charAt(2);
        String valueSimbol3 = String.valueOf(extractSimbol3);
        int forSumNumber3 = Integer.parseInt(valueSimbol3);
        String forConvertNumber4 = String.valueOf(number);
        char extractSimbol4 = forConvertNumber4.charAt(3);
        String valueSimbol4 = String.valueOf(extractSimbol4);
        int forSumNumber4 = Integer.parseInt(valueSimbol4);
        int sumAllNumbers = forSumNumber1 + forSumNumber2 + forSumNumber3 + forSumNumber4;
        System.out.println(sumAllNumbers);
    }
}
