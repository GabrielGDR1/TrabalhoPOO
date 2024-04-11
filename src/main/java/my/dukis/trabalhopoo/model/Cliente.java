package my.dukis.trabalhopoo.model;


public class Cliente {
    private String nome;
    private Endereco endereco;
    private String cpf;
    private String rg;
    private String dtNascimento;
    private int idade;

    public Cliente() {

    }

    public Cliente(Endereco endereco, String nome, String cpf, String rg, String dtNascimento, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.dtNascimento = dtNascimento;
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome" + nome + ", endereco" + endereco + ", cpf" + cpf + ", rg" + rg + ", dtNascimento" + dtNascimento + ", idade" + idade + '}';
    }

}

