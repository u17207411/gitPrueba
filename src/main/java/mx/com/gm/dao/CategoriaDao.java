package mx.com.gm.dao;

import mx.com.gm.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDao extends CrudRepository<Categoria, Integer>{
    
}
