package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorMain {
    @GetMapping
    public String manu(){
        return "В адресной строке введите: " +
                " /calculator - для входа в калькулятор.";

    }
    @GetMapping(path="/calculator")
    public String calculatorHello(){
        return "Добро пожаловать в калькулятор.";
    }
    @GetMapping(path = "/calculator/plus")
    public String add(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        int numSt1 = Integer.parseInt(num1);
        int numSt2 = Integer.parseInt(num2);
        //int sum=num1+num2;
        return num1 + "+" + num2;
    }
    @GetMapping(path = "/calculator/minus")
    public int subtract(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return num1 - num2;
    }
    @GetMapping(path = "/calculator/multiply")
    public int multiply(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return num1 * num2;
    }
    @GetMapping(path = "/calculator/divide")
    public int divide(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return num1 / num2 ;
    }

}
