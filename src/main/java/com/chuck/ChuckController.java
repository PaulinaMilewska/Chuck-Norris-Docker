package com.chuck;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChuckController {

    public ChuckController() {
    }

    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
    String quote = quotes.getRandomQuote();

    @RequestMapping("/app")
    public ModelAndView indexGet() {
        return new ModelAndView("index", "quote", quote);
    }
}
