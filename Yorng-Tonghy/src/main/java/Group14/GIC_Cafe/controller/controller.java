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
   @GetMapping(path = "/cashier_section5")
   public ModelAndView cashier_section5(){
        return new ModelAndView("cashier_section5");
   }
    // -----Your section here------- 
    @GetMapping(path = "/home_admin")
   public ModelAndView home_admin(){
        return new ModelAndView("home_admin");
   }
   

}
