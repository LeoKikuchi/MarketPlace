package com.spring.marketblog.Controller;

import com.spring.marketblog.service.CodemarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Codemarketcontroller {

    @Autowired
    CodemarketService codemarketService;
}
