package es.thymeleaft.javi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author javier.martin
 *
 */

@Controller
public class IndexController 
{
    @RequestMapping(value = {"/", "/index"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String index(ModelMap model) 
    {
    	model.addAttribute("title", "Hola mundo con thymeleaf");
        return "index";
    }
}