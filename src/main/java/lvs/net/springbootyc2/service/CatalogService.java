package lvs.net.springbootyc2.service;


import lvs.net.springbootyc2.model.Catalog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatalogService {
    Catalog save(Catalog c);
    void delete(String id);
    Catalog get(String id);
    List<Catalog> getAll();
    Catalog update(Catalog c);
}
