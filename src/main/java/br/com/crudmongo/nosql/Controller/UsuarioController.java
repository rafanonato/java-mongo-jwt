package br.com.crudmongo.nosql.Controller;

import br.com.crudmongo.nosql.Document.Usuario;
import br.com.crudmongo.nosql.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;


    @RequestMapping(method = RequestMethod.GET, value = "/usuario")
    public Iterable<Usuario> buscaUsuario(){
        return usuarioRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/usuario")
    public Usuario cadastraUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/usuario/{id}")
    public void deletaUsuario(@PathVariable(name = "{id}") String id){
        this.usuarioRepository.delete(id);
    }


}
