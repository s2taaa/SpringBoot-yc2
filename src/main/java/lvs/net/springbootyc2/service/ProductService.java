package lvs.net.springbootyc2.service;

import lvs.net.springbootyc2.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product save(Product p);
    void delete(String id);
    Product get(String id);
    List<Product> getAll();
    Product update(Product p);
}
