package io.turntabl.maths;

public class Numbers {

    public static int sumTwonumbers(int num1, int num2){
        return num1 + num2;
    }

    public static boolean isPositive(int number){
        if (number > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isNegative(int number){
        if (number < 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isEvenGreaterThanZero(int number){
        if ( number > 0 && number%2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isAleapYear(int year){
        if( (year % 4 == 0 && year % 400 == 0) || year % 100 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
