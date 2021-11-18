package com.kciamaga.customersservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers/")
public class CONTRO {





    @GetMapping()
    public void gettt(){
        System.out.println("Dupa");
    }
}
