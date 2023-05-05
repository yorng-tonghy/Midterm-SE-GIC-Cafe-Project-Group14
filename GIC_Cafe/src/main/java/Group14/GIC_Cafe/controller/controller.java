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
