/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.librodevisita.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LidiaE_18
 */
@Controller//llama donde se este escuchando

public class HomeControler  extends BaseController{
    
    @RequestMapping({"/","/home","inicio"})//direcciones donde esta escuchando
    public String home(HttpServletRequest request){
        log.debug("Loading home page");
        return "home/index";//utiliza el viewsolver
    }
            
}
