
package my.dukis.trabalhopoo.model;

public class Endereco {
    private String rua;
    private String bairro;
    private String estado;
    private String pais;
    private String cidade;
    private int numero;

    public Endereco() {
    }

    public Endereco(String rua, String bairro, String estado, String pais, String cidade, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.estado = estado;
        this.pais = pais;
        this.cidade = cidade;
        this.numero = numero;
    }

    
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua" + rua + ", bairro" + bairro + ", \nestado" + estado + ", pais" + pais + ", cidade" + cidade + ", numero" + numero + '}';
    }
    
}
