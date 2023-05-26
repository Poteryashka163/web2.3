package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final СalculationServise сalculationServise;
    public CalculatorController(СalculationServise сalculationServise){
        this.сalculationServise = сalculationServise;
    }


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
    public String add(@RequestParam(required = false) int num1, @RequestParam(required = false) int num2) {
        return  сalculationServise.add(num1,num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String subtract(@RequestParam int num1,@RequestParam int num2) {
        return  сalculationServise.subtract(num1,num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1,@RequestParam int num2) {
        return  сalculationServise.multiply(num1,num2);

    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1,@RequestParam int num2) {
        return сalculationServise.divide(num1,num2);
    }

}
