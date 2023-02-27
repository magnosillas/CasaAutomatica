package Casa;

public class Adress {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String referencia;

    public Adress(String logradouro, String bairro, String cep, String numero) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
    }

    public Adress(String logradouro, String bairro, String cep, String numero, String complemento, String referencia) {
        this(logradouro, bairro, cep, numero);
        this.complemento = complemento;
        this.referencia = referencia;
    }


    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }
}
