package org.spring.springboot.web;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ImageUploadController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "11Hello,World!";
    }
    
   

}
