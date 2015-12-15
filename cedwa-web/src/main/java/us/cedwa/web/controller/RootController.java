package us.cedwa.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import us.cedwa.dao.UserRepository;
import us.cedwa.dao.entity.User;

@RestController()
public class RootController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping("/")
    @ResponseBody
    String root() {
        return "Hello World!";
    }

    @RequestMapping("/do-something")
    @ResponseBody
    String doSomething() {
        User user = userRepo.findByName("Chris Edwards").get(0);
        return String.format("Hello, %s", user.getName());
    }
}