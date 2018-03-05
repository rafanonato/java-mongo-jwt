package br.com.crudmongo.nosql.Service;

import br.com.crudmongo.nosql.Document.Usuario;
import br.com.crudmongo.nosql.Repository.UsuarioRepository;

import java.util.List;

public interface UsuarioService extends UsuarioRepository {

    List<Usuario> listAll();

    List<Usuario> listOfId(String id);



}
