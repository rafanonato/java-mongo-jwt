package br.com.crudmongo.nosql.Repository;

import br.com.crudmongo.nosql.Document.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {


}
