package br.com.caelum.contas.modelo;

import java.util.List;
import java.util.Map;

public class Banco {
    private String nome;
    private int numero;
    private List<Conta> contas;
    private Map<String, Conta> mapContas;

    public Banco (String nome, int numero)
    {
        this.nome = nome;
        this.numero = numero;
    }

    public void adiciona (Conta c)
    {
        contas.add (c);
        mapContas.put (c.getTitular(), c);
    }

    public Conta pega (int x)
    {
        return contas.get (x);
    }

    public int pegaQuantidadeDeContas ()
    {
        return contas.size ();
    }

    public Conta buscaPorTitular (String nome)
    {
        return mapContas.get (nome);
    }
}
