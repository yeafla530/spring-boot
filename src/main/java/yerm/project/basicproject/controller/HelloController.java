package yerm.project.basicproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
//    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @GetMapping("hello")
//    메소드 생성
    public String hello() {
        return "Hello World!";
    }
}
