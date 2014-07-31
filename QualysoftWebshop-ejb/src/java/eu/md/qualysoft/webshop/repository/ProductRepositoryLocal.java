/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.md.qualysoft.webshop.repository;

import eu.md.qualysoft.webshop.entity.Product;
import javax.ejb.Local;

/**
 *
 * @author zsolt
 */
@Local
public interface ProductRepositoryLocal {

    Product findById(long id);
    
}
