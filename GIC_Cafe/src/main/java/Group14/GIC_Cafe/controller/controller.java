package Group14.GIC_Cafe.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
// import org.springframework.*;

import ch.qos.logback.core.model.Model;


@RestController

public class controller {

     @GetMapping(path = "/cashier_section4")
     public ModelAndView cashier_section4(){
          return new ModelAndView("cashier_section4");
     }

     //----- YORNG TONGHY Section----
    @GetMapping(path = "/cashier_section6")
   public ModelAndView cashier_section6(){
        return new ModelAndView("cashier_section6");
   }

   @GetMapping(path = "/reciept")
   public ModelAndView reciept(){
        return new ModelAndView("reciept");
   }
   @GetMapping(path = "/products")
   public ModelAndView crud_products(){
        return new ModelAndView("crud_products");
   }
   @GetMapping(path = "/cashier_section5")
   public ModelAndView cashier_section5(){
        return new ModelAndView("cashier_section5");
   }
   @GetMapping(path = "/table_selection")
   public ModelAndView table_selection(){
        return new ModelAndView("table_selection");
   }
   @GetMapping(path = "/order_history")
   public ModelAndView order_history(){
        return new ModelAndView("order_history");
   }
    // -----Your section here------- 

   

     @GetMapping(path = "/drink_select_order_info")
     public Object drink_select_order_info() {
          return new ModelAndView("drink_select_order_info");
     }

     @GetMapping(path = "/add_edit_cashier")
     public Object add_edit_cashier(){
          return new ModelAndView("add_edit_cashier");
     }

     @GetMapping(path = "/categories_management")
     public Object categories_management(){
          return new ModelAndView("categories_management");
     }
}
