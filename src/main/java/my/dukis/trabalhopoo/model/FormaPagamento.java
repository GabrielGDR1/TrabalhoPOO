package my.dukis.trabalhopoo.model;


public class FormaPagamento {
        private int codigo;
    private String descricao;

    public FormaPagamento() {
        
    }

    public FormaPagamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "codigo=" + codigo + ", descricao=" + descricao + '}';
    }
}
