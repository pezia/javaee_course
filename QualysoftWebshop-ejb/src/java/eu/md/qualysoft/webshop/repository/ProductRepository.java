package eu.md.qualysoft.webshop.repository;

import eu.md.qualysoft.webshop.entity.Product;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductRepository implements ProductRepositoryLocal {
    
    @PersistenceContext
    EntityManager em;
    
    @Override
    public Product findById(long id) {
        
        return null;
        
    }

}
