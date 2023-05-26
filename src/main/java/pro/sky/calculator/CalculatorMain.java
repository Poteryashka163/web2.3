package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorMain {
    public Сalculation calculation = new Сalculation();

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
        return  calculation.add(num1,num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String subtract(@RequestParam("num1") String num1,@RequestParam("num2") String num2) {
        return  calculation.subtract(num1,num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") String num1,@RequestParam("num2") String num2) {
        return  calculation.multiply(num1,num2);

    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") String num1,@RequestParam("num2") String num2) {
        return calculation.divide(num1,num2);
    }

}
