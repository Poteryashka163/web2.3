package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final СalculationServise сalculationServise;
    public CalculatorController(СalculationServise сalculationServise){
        this.сalculationServise = сalculationServise;
    }


    @RequestMapping
    public String manu(){
        return "Добро пожаловать в калькулятор.";

    }
    @GetMapping(path = "/plus")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        return  сalculationServise.add(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String subtract(@RequestParam int num1,@RequestParam int num2) {
        return  сalculationServise.subtract(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1,@RequestParam int num2) {
        return  сalculationServise.multiply(num1,num2);

    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1,@RequestParam int num2) {
        return сalculationServise.divide(num1,num2);
    }

}
