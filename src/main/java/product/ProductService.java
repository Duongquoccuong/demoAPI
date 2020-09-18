package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public List<Product> listAll(){
        return repository.findAll();
    }
    public void save(Product product){
        repository.save(product);
    }
    public Product get(Integer id){
        return repository.findById(id).get();
    }
    public void delete(Integer id){
        repository.findById(id);
    }
}
