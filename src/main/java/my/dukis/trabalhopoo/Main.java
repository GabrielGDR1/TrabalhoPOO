package my.dukis.trabalhopoo;

import javax.swing.JOptionPane;
import my.dukis.trabalhopoo.model.Cliente;
import my.dukis.trabalhopoo.model.Endereco;
import my.dukis.trabalhopoo.model.FormaPagamento;
import my.dukis.trabalhopoo.model.Livros;
import my.dukis.trabalhopoo.model.Vendas;

    
public class Main {

    public static void main(String[] args) {  
    Livros persyJackson = new Livros(
        1,
        "persy jackson",
        "Editora 1",
        "Autor 1",
        "suspense/terror",
        2011,
        300,
        5,
        10.0
);

        Livros piratasDoCaribe = new Livros(
        2,
        "piratas do caribe",
        "Editora 2",
        "Autor 2",
        "Aventura/suspense",
        2014,
        376,
        2,
        10.0
);

Livros mobyDicky = new Livros(
        3,
        "moby dicky",
        "Editora 3",
        "Autor 3",
        "romance",
        1997,
        600,
        8,
        10.0
);

JOptionPane.showInputDialog(
        null,
        "Livros Cadastrados:\n"
                + persyJackson.toString()
                + "\n"
                + piratasDoCaribe.toString()
                + "\n"
                + mobyDicky.toString()
);

        Endereco endereco = new Endereco(
        "rua virilio comerlato",
        "Porto alegre",
        "Paraná",
        "Brasil",
        "Toledo",
        45
);

        Cliente Bruno = new Cliente(
        endereco,
        "Bruno teleken",
        "198642101",
        "763120418",
        "13/02/2003",
        20
);

        FormaPagamento débito = new FormaPagamento(1, "Débito");
        FormaPagamento boleto = new FormaPagamento(2, "boleto");

        Vendas venda1 = new Vendas();
venda1.setCliente(Bruno);
venda1.setVlrDesconto(7.00);
venda1.ListaLivros().add(persyJackson);
venda1.ListaLivros().add(piratasDoCaribe);
venda1.ListaLivros().add(mobyDicky);
venda1.ListaFormaPgt().add(boleto);
venda1.ListaFormaPgt().add(débito);
venda1.setQntLivros(1, 5);
venda1.setQntLivros(2, 2);
venda1.setQntLivros(3, 8);
venda1.diminuiEstoque(persyJackson);
venda1.diminuiEstoque(piratasDoCaribe);
venda1.diminuiEstoque(mobyDicky);

    venda1.calcularTotal();
 
    JOptionPane.showInputDialog(null,"\nRegistro da Vennda:\n " + venda1.toString());

    }
}