import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("gustavo", LocalDate.of(2003, 2, 24));
        Assertions.assertEquals(21, pessoa.getIdade());
    }

    @Test
    void deveRetonarSeehMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("gustavo", LocalDate.of(2003, 2, 24));
        Assertions.assertTrue(pessoa.ehMaiordDeIdade());
    }

}
