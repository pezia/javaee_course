package hu.qualysoft.webshop.rest;

import eu.md.qualysoft.webshop.entity.Product;
import eu.md.qualysoft.webshop.repository.ProductRepositoryLocal;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service for handling Products
 *
 * @author Zsolt Petrik
 */
@Path("/product")
@RequestScoped
public class ProductResource {

    @Inject
    ProductRepositoryLocal productRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProduct(@PathParam("id") long id) {
        return productRepository.findById(id);
    }
}
