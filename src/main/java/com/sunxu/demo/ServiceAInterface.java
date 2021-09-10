package com.sunxu.demo;

import org.springframework.web.bind.annotation.*;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/9/10 19:26
 */
public interface ServiceAInterface {

    @RequestMapping(value = "/user/sayHello/{id}", method = RequestMethod.GET)
    String sayHello(@PathVariable("id") Long id,
                    @RequestParam("name") String name,
                    @RequestParam("age") Integer age);

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    String createUser(@RequestBody User user);

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    String updateUser(@PathVariable("id") Long id,
                      @RequestBody User user);

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    String deleteUser(@PathVariable("id") Long id);

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User getById(@PathVariable("id") Long id);
}
