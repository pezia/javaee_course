package eu.md.qualysoft.webshop.repository;

import eu.md.qualysoft.webshop.entity.Product;
import javax.ejb.Local;

/**
 * Product repository local business interface
 *
 * @author Zsolt Petrik
 */
@Local
public interface ProductRepositoryLocal {

    Product findById(long id);

}
