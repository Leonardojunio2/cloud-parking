package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/")
@ApiIgnore //Ignora esta controle no swagger
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello DIO. Java devs";
    }

}
