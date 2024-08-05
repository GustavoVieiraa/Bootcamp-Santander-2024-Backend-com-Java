package dio.web_api.repository;

import dio.web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getId()==null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório.");
        }
        else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório.");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d pra excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gustavo", "testpassword"));
        usuarios.add(new Usuario("sophya", "passwordtest"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gustavo", "testpassword");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar o usuário", username));
        return new Usuario("gustavo", "testpassword");
    }

}
