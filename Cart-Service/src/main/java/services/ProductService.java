package services;

import com.example.Cart.Service.models.Product;
import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
    Product getSingleProduct(Long id);
    Product createProduct(Product product);
}

