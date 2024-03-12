package services;

import com.example.Cart.Service.dto.*;
import com.example.Cart.Service.models.Category;
import com.example.Cart.Service.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class CartService {
    private RestTemplate restTemplate = new RestTemplate();

    // @Override
    public List<Product> getAllProducts() {
        return null;
    }
    // @Override
    @SuppressWarnings("null")
    public Product getSingleProduct(Long id) {

        CartServiceProductdto CartServiceProductdto =  restTemplate.getForObject(
            "https://fakestoreapi.com/products/" + id,
            CartServiceProductdto.class
        );

        Product product = new Product();
        product.setId(CartServiceProductdto.getId());
        product.setTitle(CartServiceProductdto.getTitle());
        product.setPrice(CartServiceProductdto.getPrice());
        product.setImageUrl(CartServiceProductdto.getImage());
        product.setDescription(CartServiceProductdto.getDescription());
        product.setCategory(new Category());
        return product;
    }
}
