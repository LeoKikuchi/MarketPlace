package com.spring.marketblog.Controller;

import com.spring.marketblog.service.CodemarketService;
import com.spring.marketblog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Codemarketcontroller {

    @Autowired
    CodemarketService codemarketService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = codemarketService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }
}
