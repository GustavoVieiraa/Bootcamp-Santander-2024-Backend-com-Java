package dio.web_api.controller;

import dio.web_api.model.Usuario;
import dio.web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping()
    public List<Usuario> getUsers() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return usuarioRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable("id") Integer id) {
        usuarioRepository.deleteById(id);
    }

    @PostMapping()
    public void postUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }

}
