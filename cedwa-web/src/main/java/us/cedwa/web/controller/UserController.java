package us.cedwa.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import us.cedwa.dao.repository.UserRepository;
import us.cedwa.dao.entity.User;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

/**
 * Created by cedwa on 1/19/16.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> list() {
        return Collections.emptyList();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody User user) {

    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody User user) {

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateById(@PathVariable("id") BigInteger id, @RequestBody User user) {

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete() {

    }
}
