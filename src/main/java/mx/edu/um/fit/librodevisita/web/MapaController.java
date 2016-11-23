/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.librodevisita.web;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import mx.edu.um.fit.librodevisita.model.Localizacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author LidiaE_18
 */
@Controller
@RequestMapping("/localizacion")//edita el archivo que se llama
public class MapaController extends BaseController{
    //@Autowired
   // private LocalizacionService localizacionService;
    
    @RequestMapping("/new")
    public String newLocalizacion(Model model) {
        log.debug("New Localizacion...");
        Localizacion localizacion= new Localizacion();//
        //Localizacion localizacion = new Machine();
        
        //model.addAttribute(Constants.MACHINE_UI, machine);
      

        return "/localizacion/new";
    }

    @RequestMapping("/create")
    public String create(HttpServletRequest request, @Valid Localizacion localizacion, BindingResult bindingResult, Errors errors, Model Model, RedirectAttributes redirectAttributes){
        log.debug("Crear Localizacion...");
        
        //Localizacion l=
                return "redirect:/localizacion/list";
    }
}
