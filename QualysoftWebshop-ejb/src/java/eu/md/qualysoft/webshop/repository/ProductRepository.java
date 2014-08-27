package eu.md.qualysoft.webshop.repository;

import eu.md.qualysoft.webshop.entity.Product;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Product repository for handling Product entities
 *
 * @author Zsolt Petrik
 */
@Stateless
public class ProductRepository implements ProductRepositoryLocal {
    
    @PersistenceContext
    EntityManager em;
    
    @Override
    public Product findById(long id) {
        return em.find(Product.class, id);
    }
    
    @Override
    public List<Product> findAll() {
        return em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }
    
}
