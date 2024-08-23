package poo.provas.P1.Segundo2016;

import java.util.ArrayList;

public class Loja {
    private int id;
    private String nome;
    private ArrayList produtosVendidos = new ArrayList ();
    private ArrayList estoque = new ArrayList ();

    public void setId (int id)
    {
        this.id = id;
    }

    public int getId ()
    {
        return this.id;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public double faturamentoBruto ()
    {
        double total = 0;

        for (Object i : produtosVendidos)
        {
            total += ((Produto) i).getPreco();
        }

        return total;
    }

    public int quantidadeProdutosVendidos ()
    {
        return produtosVendidos.size();
    }

    public int quantidadeProdutosLigaveisVendidos ()
    {
        int total = 0;

        for (Object i : produtosVendidos)
        {
            if (i instanceof Ligavel)
                total++;
        }

        return total;
    }

    public void imprimirRelatorioVenda ()
    {
        for (Object i : produtosVendidos)
        {
            System.out.println ("ID: " + ((Produto) i).getId () + "\nPreço: " + ((Produto) i).getPreco());

            if (i instanceof Carro)
                System.out.println ("Placa: " + ((Carro) i).getPlaca ());
            else if (i instanceof Liquidificador)
                System.out.println ("Marca: " + ((Liquidificador) i).getMarca ());
            else
                System.out.println ("Tipo: " + ((Chocolate) i).getTipo ());
        }
    }

    public void adicionarAoEstoque (Produto produto)
    {
        estoque.add (produto);
    }

    public void vender (Produto produto)
    {
        produtosVendidos.add(estoque.remove(estoque.indexOf(produto)));
    }

    public ArrayList getEstoque ()
    {
        return this.estoque;
    }

    public void imprimirProdutosNoEstoque ()
    {
        for (Object i : estoque)
        {
            System.out.println ("ID: " + ((Produto) i).getId () + "\nPreço: " + ((Produto) i).getPreco());

            if (i instanceof Carro)
                System.out.println ("Placa: " + ((Carro) i).getPlaca ());
            else if (i instanceof Liquidificador)
                System.out.println ("Marca: " + ((Liquidificador) i).getMarca ());
            else
                System.out.println ("Tipo: " + ((Chocolate) i).getTipo ());
        }
    }
}
