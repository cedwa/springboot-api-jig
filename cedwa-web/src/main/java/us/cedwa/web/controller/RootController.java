package us.cedwa.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import us.cedwa.dao.repository.UserRepository;

@RestController
@RequestMapping(value = "/root")
public class RootController {

    @Autowired
    UserRepository repository;

    @RequestMapping("/")
    @ResponseBody
    String root() {
        return "Hello World!";
    }

    @RequestMapping("/who-dat")
    @ResponseBody
    String doSomething() {
        return "cedwa, bitch!";
    }
}