package br.com.crudmongo.nosql.Service.ServiceImp;


import br.com.crudmongo.nosql.Document.Usuario;
import br.com.crudmongo.nosql.Repository.UsuarioRepository;
import br.com.crudmongo.nosql.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class UsuarioImp implements UsuarioService {


    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> listAll() {
        return null;
    }

    @Override
    public List<Usuario> listOfId(String id) {
        return null;
    }
}