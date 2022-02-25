package lvs.net.springbootyc2.respository;

import lvs.net.springbootyc2.model.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends MongoRepository<Catalog,String> {
}
