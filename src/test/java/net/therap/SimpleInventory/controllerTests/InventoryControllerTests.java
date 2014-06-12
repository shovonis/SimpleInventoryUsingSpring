package net.therap.SimpleInventory.controllerTests;

import junit.framework.TestCase;
import net.therap.SimpleInventory.controller.InventoryController;
import net.therap.SimpleInventory.service.SimpleProductManager;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */
public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {
        InventoryController controller = new InventoryController();
        controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("product", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map map = (Map) modelAndView.getModel().get("myModel");
        String now = (String) map.get("now");
        assertNotNull(now);
    }
}
