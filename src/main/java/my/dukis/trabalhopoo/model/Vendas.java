package my.dukis.trabalhopoo.model;

import java.util.ArrayList;
import java.util.Arrays;


public class Vendas {
    private Cliente cliente;
    private ArrayList<Livros> listaLivros;
    private int[] qntLivros = new int[3];
    private double vlrDesconto;
    private double vlrTotal;
    private ArrayList<FormaPagamento> listaFormaPgt;
    private Livros livros;
    private int cdLivro;

    public Vendas(Cliente cliente, Vendas venda, double vlrTotal, double vlrDesconto, ArrayList<Livros> listaLivros, int qtnLivros, ArrayList<FormaPagamento> listaFormaPgt, int cdLivro) {
        this.cliente = cliente;
        this.vlrTotal = vlrTotal;
        this.vlrDesconto = vlrDesconto;
        this.listaLivros = listaLivros;
        this.qntLivros[cdLivro] = qtnLivros;
        this.listaFormaPgt = listaFormaPgt;
        this.cdLivro = cdLivro;
    }

    public int getCdLivro() {
        return cdLivro;
    }

    public void setCdLivro(int cdLivro) {
        this.cdLivro = cdLivro;
    }

    public Vendas() {
        this.listaLivros = new ArrayList<>();
        this.listaFormaPgt = new ArrayList<>();
    }

    public void calcularTotal() {
        vlrTotal = -vlrDesconto;

        for (int i = 0; i < listaLivros.size(); i++) {
            vlrTotal = vlrTotal + (listaLivros.get(i).getPrcVenda()*qntLivros[i]);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    public double getVlrDesconto() {
        return vlrDesconto;
    }

    public void setVlrDesconto(double vlrDesconto) {
        this.vlrDesconto = vlrDesconto;
    }

    public int[] getQntLivros() {
        return qntLivros;
    }

    public void setQntLivros(int cdLivro, int qntLivro) {
        qntLivros[(cdLivro - 1)] = qntLivro;
    }

    public void diminuiEstoque(Livros livro) {
        cdLivro = livro.getCodigo();
        livro.diminuirEstoque(livro, qntLivros[(cdLivro-1)]);
    }

    public ArrayList<Livros> ListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(ArrayList<Livros> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public ArrayList<FormaPagamento> ListaFormaPgt() {
        return listaFormaPgt;
    }

    public void setListaFormaPgt(ArrayList<FormaPagamento> listaFormaPgt) {
        this.listaFormaPgt = listaFormaPgt;
    }

    public Livros getLivros() {
        return livros;
    }

    public void setLivros(Livros livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Vendas{" + "cliente=" + cliente + ", listaLivros=" + listaLivros + ", \nqntLivros=" + Arrays.toString(qntLivros) + ", \nnvlrDesconto=" + vlrDesconto + ", vlrTotal=" + vlrTotal + ", \nlistaFormaPgt=" + listaFormaPgt + '}';
    }

}
