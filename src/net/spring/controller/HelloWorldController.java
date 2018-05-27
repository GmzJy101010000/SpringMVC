package net.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

 @RequestMapping("/hell")
 public ModelAndView helloWorld() {

  String message = "Hello World, Spring 3.0!";
  System.out.println(message);
  return new ModelAndView("hell", "message", message);
  //return "hell";
 }
 @RequestMapping("/22")
 public ModelAndView helloWorld1() {

  String message = "Hello World, Spring 3.0!";
  System.out.println(message);
  return new ModelAndView("22", "message", message);
  //return "22";
 }
}