package me.dio.mockito.exemplos;

public class Email {

    private String enderecoEmail;
    private String mensagem;
    private boolean formatoHTML;

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isFormatoHTML() {
        return formatoHTML;
    }

    public void setFormatoHTML(boolean formatoHTML) {
        this.formatoHTML = formatoHTML;
    }

    public Email(String enderecoEmail, String mensagem, boolean formatoHTML) {
        this.enderecoEmail = enderecoEmail;
        this.mensagem = mensagem;
        this.formatoHTML = formatoHTML;
    }
}
