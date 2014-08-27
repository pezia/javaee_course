package eu.md.qualysoft.webshop.repository;

import eu.md.qualysoft.webshop.entity.Product;
import java.util.List;
import javax.ejb.Local;

/**
 * Product repository local business interface
 *
 * @author Zsolt Petrik
 */
@Local
public interface ProductRepositoryLocal {

    Product findById(long id);

    List<Product> findAll();

}
