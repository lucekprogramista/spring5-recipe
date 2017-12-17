package lucek.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getPageIndex() {
        System.out.println("cos tam printuje");
        return "index";
    }
}
