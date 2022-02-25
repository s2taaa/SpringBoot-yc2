package lvs.net.springbootyc2.respository;


import lvs.net.springbootyc2.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
}
