package net.therap.SimpleInventory.controllerTests;

import junit.framework.TestCase;
import net.therap.SimpleInventory.controller.InventoryController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */
public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {
        InventoryController controller = new InventoryController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String now = (String) modelAndView.getModel().get("now");
        assertNotNull(now);
    }
}
