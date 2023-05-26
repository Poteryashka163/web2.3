package pro.sky.calculator;


public class Сalculation {


    public String add(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum = number1+number2;
        String result = Integer.toString(sum);
        return num1 + " + " + num2 + " = " + result;

    }
    public String subtract( String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum = number1-number2;
        String result = Integer.toString(sum);
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(String num1, String num2) {

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum = number1*number2;
        String result = Integer.toString(sum);
        return num1 + " * " + num2 + " = " + result;
    }
    public String divide(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        String result = null;
        if (number2 == 0) {
            result = "Error: division by zero";
        } else {
            result = num1 + " / " + num2 + " = " + number1 / number2;
        }
        return result;
    }
    public String xxx (String num1, String num2) {
        String result = null;
        if (num1 == null || num2 == null) {
            result = "Error: не хватает переменных";
        } else {
            result = xxx(num1,num2);
        }
        return result;
    }
}
