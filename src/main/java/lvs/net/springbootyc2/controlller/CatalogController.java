package lvs.net.springbootyc2.controlller;

import lvs.net.springbootyc2.model.Catalog;
import lvs.net.springbootyc2.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("service/catalog")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

    @PostMapping
    public Catalog save(@RequestBody Catalog catalog){
        return catalogService.save(catalog);
    }

    @GetMapping("/{id}")
    public Catalog findById(@PathVariable(value = "id") String id){
        return catalogService.get(id);
    }

    @GetMapping
    public List<Catalog> findAll(){
        return catalogService.getAll();
    }

    @PutMapping("/{id}")
    public Catalog update(@RequestBody Catalog catalog){
        return catalogService.update( catalog);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") String id){
        catalogService.delete(id);
    }
}
