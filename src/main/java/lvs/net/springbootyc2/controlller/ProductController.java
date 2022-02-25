package lvs.net.springbootyc2.controlller;

import lvs.net.springbootyc2.model.Product;
import lvs.net.springbootyc2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("service/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable(value = "id") String id){
        return productService.get(id);
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.getAll();
    }

    @PutMapping("/{id}")
    public Product update(@RequestBody Product product){
        return productService.update( product);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") String id){
        productService.delete(id);
    }
}
