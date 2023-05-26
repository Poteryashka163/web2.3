package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class СalculationServise {


    public String add(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1+num2);

    }
    public String subtract( int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }
    public String divide(int num1, int num2) {
        String result = null;
        if (num2 == 0) {
            result = "Error: division by zero";
        } else {
            result = num1 + " / " + num2 + " = " + (num1 / num2);
        }
        return result;
    }
    //public xxx (String num1, String num2) {
        //String result = null;
        //if (num1 == null || num2 == null) {
            //result = "Error: не хватает переменных";
        //} else {
        //    result = num1,num2;
        //}
        //return result;
    }

