package info.ejava.examples.ejb.cdisales.bl;

import java.util.List;

import info.ejava.examples.ejb.cdisales.bo.Member;
import info.ejava.examples.ejb.cdisales.bo.Product;
import info.ejava.examples.ejb.cdisales.ejb.InvalidProduct;

public interface ProductCatalog {
    Product addProduct(Product product) throws InvalidProduct;
    List<Product> getProductsForSale(Product template, int offset, int limit);
    List<Product> getBuyerProducts(Member buyer, int offset, int limit);
    List<Product> getSellerProducts(Member seller, int offset, int limit);
    int remove(Product product);
}
