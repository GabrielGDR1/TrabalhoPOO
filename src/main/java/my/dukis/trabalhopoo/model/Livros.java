package my.dukis.trabalhopoo.model;


public class Livros {
    
    private int codigo;
    private String descricao;
    private String editora;
    private String autores;
    private String generos;
    private int anoLancamento;
    private int numPaginas;
    private int qtnEstoque;
    private double prcVenda;
    public String toString;

    public Livros() {
    }

    public Livros(int codigo, String descricao, String editora, String autores, String generos, int anoLancamento, int numPaginas, int qtnEstoque, double prcVenda) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.editora = editora;
        this.autores = autores;
        this.generos = generos;
        this.anoLancamento = anoLancamento;
        this.numPaginas = numPaginas;
        this.qtnEstoque = qtnEstoque;
        this.prcVenda = prcVenda;
    }

    public void diminuirEstoque(Livros Livros, int qtnvendido) {
        Livros.qtnEstoque = Livros.qtnEstoque - qtnvendido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getQtnEstoque() {
        return qtnEstoque;
    }

    public void setQtnEstoque(int qtnEstoque) {
        this.qtnEstoque = qtnEstoque;
    }

    public double getPrcVenda() {
        return prcVenda;
    }

    public void setPrcVenda(double prcVenda) {
        this.prcVenda = prcVenda;
    }

    @Override
    public String toString() {
        return "Livros{" + "codigo=" + codigo + ", descricao=" + descricao + ", editora=" + editora + ", autores=" + autores + ", generos=" + generos + ", anoLancamento=" + anoLancamento + ", numPaginas=" + numPaginas + ", qtnEstoque=" + qtnEstoque + ", prcVenda=" + prcVenda + '}';
    }

}
