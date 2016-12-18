package cz.muni.pa165.pneuservis.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author Michal Krajcovic <mkrajcovic@mail.muni.cz>
 */
@ApiIgnore
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/swagger-ui.html";
    }
}
