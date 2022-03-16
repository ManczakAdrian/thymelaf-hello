package pl.manczak.thymelafhello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/car")
    public String get(Model model){
        Car car=new Car("BMW", "i8");

        model.addAttribute("name","Adrian");
        model.addAttribute("car",car);
        return "car";

    }
}
