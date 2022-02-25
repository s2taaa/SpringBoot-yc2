package lvs.net.springbootyc2.service.impl;

import lvs.net.springbootyc2.model.Catalog;
import lvs.net.springbootyc2.respository.CatalogRepository;
import lvs.net.springbootyc2.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogImpl implements CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;
    @Override
    public Catalog save(Catalog c) {
        return catalogRepository.save(c);
    }

    @Override
    public void delete(String id) {
        catalogRepository.deleteById(id);

    }

    @Override
    public Catalog get(String id) {
        return catalogRepository.findById(id).get();
    }

    @Override
    public List<Catalog> getAll() {
        return catalogRepository.findAll();
    }

    @Override
    public Catalog update(Catalog c) {
        return catalogRepository.save(c);
    }
}
