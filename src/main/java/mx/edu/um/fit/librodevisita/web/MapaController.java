/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.librodevisita.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import mx.edu.um.fit.librodevisita.config.Constants;
import mx.edu.um.fit.librodevisita.model.Localizacion;
import mx.edu.um.fit.librodevisita.service.LocalizacionService;
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
    @Autowired
   private LocalizacionService localizacionService;
    
    @RequestMapping("/new")
    public String newLocalizacion(Model model) {
        log.debug("New Localizacion...");
        Localizacion localizacion= new Localizacion();
        
        model.addAttribute(Constants.LOCALIZACION_UI, localizacion);
        
        return "/localizacion/new";
    }

    @RequestMapping("/create")
    public String create(HttpServletRequest request, @Valid Localizacion localizacion, BindingResult bindingResult, Errors errors, Model model, RedirectAttributes redirectAttributes){
        log.debug("Crear Localizacion...");
         if (bindingResult.hasErrors()) {
            log.error("Error detected in user form...");
            model.addAttribute(Constants.LOCALIZACION_UI, localizacion);
            return "/localizacion/new";
        }
         
        log.debug("Datos enviados: " + localizacion.toString());
        Localizacion l= localizacionService.save(localizacion);
        redirectAttributes.addFlashAttribute(Constants.MESSAGE_UI,"La localizacion ha sido creada satisfactoriamente");
        //redirectAttributes.addFlashAttribute(Constants.MESSAGE_ATTRS_UI,new String[]{localizacion.getLatitud()});
                
        return "redirect:/localizacion/list";
    }
    
    @RequestMapping("/list")
   public String list(Model model){
       
   List<Localizacion> list= localizacionService.getAll();
   
   model.addAttribute(Constants.LOCALIZACION_LIST_UI, list);
   return "/localizacion/list";
   } 
}
