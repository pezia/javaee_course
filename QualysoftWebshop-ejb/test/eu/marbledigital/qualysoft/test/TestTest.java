package eu.marbledigital.qualysoft.test;

import eu.md.qualysoft.webshop.entity.Product;
import eu.md.qualysoft.webshop.repository.ProductRepository;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author zsolt
 */
public class TestTest {

    private static EJBContainer container;

    @BeforeClass
    public static void setUpClass() throws Exception {
        Map<String, Object> properties = new HashMap<>();
        //properties.put(EJBContainer.MODULES, new File("build/jar"));
        properties.put(EJBContainer.MODULES, new File("target/classes"));

        container = EJBContainer.createEJBContainer(properties);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        container.close();
    }

    @Test
    public void testFinById() throws Exception {
        ProductRepository instance = (ProductRepository) container.getContext().lookup("java:global/classes/ProductRepository");

        Product product = instance.findById(1);

        assertNotNull(product);
    }
}
