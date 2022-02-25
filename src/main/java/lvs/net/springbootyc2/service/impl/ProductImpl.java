package lvs.net.springbootyc2.service.impl;

import lvs.net.springbootyc2.model.Product;
import lvs.net.springbootyc2.respository.ProductRepository;
import lvs.net.springbootyc2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product save(Product p) {
        return productRepository.save(p);
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);

    }

    @Override
    public Product get(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product update(Product p) {
        return productRepository.save(p);
    }
}
