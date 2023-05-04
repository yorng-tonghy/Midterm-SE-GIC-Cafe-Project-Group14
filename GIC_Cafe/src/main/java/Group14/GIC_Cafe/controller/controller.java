package Group14.GIC_Cafe.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
// import org.springframework.*;


@RestController

public class controller {
     //----- YORNG TONGHY Section----
    @GetMapping(path = "/cashier_section6")
   public ModelAndView cashier_section6(){
        return new ModelAndView("cashier_section6");
   }
<<<<<<< HEAD
   @GetMapping(path = "/reciept")
   public ModelAndView reciept(){
        return new ModelAndView("reciept");
   }
   @GetMapping(path = "/products")
   public ModelAndView grud_products(){
        return new ModelAndView("grud_products");
   }
    
=======
   @GetMapping(path = "/cashier_section5")
   public ModelAndView cashier_section5(){
        return new ModelAndView("cashier_section5");
   }
    // -----Your section here------- 
>>>>>>> 96e8e3ad76b1dfd1c8f7194ac582ad56b3933172
   

}
