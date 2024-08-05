package dio.springboot.app;

public class Remetente {
    private String Nome;
    private String email;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Remetente{" +
                "Nome='" + Nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
