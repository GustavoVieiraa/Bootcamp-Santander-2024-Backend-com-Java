package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {

            DadosLocalizacao dados = new DadosLocalizacao("MG", "Patos de Minas", "Rua 5", "Apto", "Centro");
            Mockito.when(apiDosCorreios.buscarDadosComBaseNoCep("2392323")).thenReturn(dados);
            Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("gustavo", "213981239", LocalDate.now(), "2392323");

        assertEquals("gustavo", pessoa.getNome());
        assertEquals("213981239", pessoa.getDocumento());
        assertEquals(LocalDate.now(), pessoa.getNascimento());
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("Apto", pessoa.getEndereco().getComplemento());

    }

}
