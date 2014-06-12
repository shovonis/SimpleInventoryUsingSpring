package net.therap.SimpleInventory.controller;

import net.therap.SimpleInventory.service.SimpleProductManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class InventoryController implements Controller {
    private static final Logger log = LoggerFactory.getLogger(InventoryController.class);

    private SimpleProductManager productManager;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String now = new Date().toString();
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("products", productManager.getProducts());

        log.info("Inventory Request Served at Time : " + now);
        return new ModelAndView("home", "myModel", myModel);
    }

    public void setProductManager(SimpleProductManager productManager) {
        this.productManager = productManager;
    }
}