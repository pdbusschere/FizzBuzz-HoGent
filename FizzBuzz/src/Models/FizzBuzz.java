package Models;

public class FizzBuzz {

    /*
    using RED, GREEN, REFACTOR
    stapjes vóór refactor staan in commentaar
    R is refactor
     */

    public static String evaluate(int i) {

        /*
        1
            return String.valueOf(1);
        2
            return String.valueOf(i);
        3
            if(i == 3){
                return "Fizz";
            }
            return String.valueOf(i);
        4
            if(i == 3){
                return "Fizz";
            }
            if(i == 5){
                return "Buzz";
            }
            return String.valueOf(i);
        4R
            switch(i){
                case 3:
                    return "Fizz";
                case 5:
                    return "Buzz";
                default:
                    return String.valueOf(i);
            }
        5
            switch(i){
                case 3:
                    return "Fizz";
                case 6:
                    return "Fizz";
                case 5:
                    return "Buzz";
                default:
                    return String.valueOf(i);
            }
        5R
            if(i % 3 == 0){
                return "Fizz";
            } else if(i == 5){
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
        6
            if(i % 3 == 0){
                return "Fizz";
            } else if(i == 5){
                return "Buzz";
            } else if(i == 10) {
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
        6R
            if(i % 3 == 0){
                return "Fizz";
            } else if(i % 5 == 0){
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
        7
            if(i == 15){
                return "FizzBuzz";
            } else if(i % 3 == 0){
                return "Fizz";
            } else if(i % 5 == 0){
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
        8
            if(i == 15) {
                return "FizzBuzz";
            } else if(i == 30){
                return "FizzBuzz";
            } else if(i % 3 == 0){
                return "Fizz";
            } else if(i % 5 == 0){
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
        8R
            if(i % 15 == 0) {
                return "FizzBuzz";
            } else if(i % 3 == 0){
                return "Fizz";
            } else if(i % 5 == 0){
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
         */
        if(i % 15 == 0) {
            return "FizzBuzz";
        } else if(i % 3 == 0){
            return "Fizz";
        } else if(i % 5 == 0){
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
