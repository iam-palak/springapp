package org.serenity.dummy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("path")
    public static String myMethod() {

        return " <h1> hey!!! This is Palak 🥰 </h1>";

    }
    
}
