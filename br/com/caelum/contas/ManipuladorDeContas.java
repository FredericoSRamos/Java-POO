package br.com.caelum.contas;

import br.com.caelum.javafx.api.util.Evento;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupança;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class ManipuladorDeContas 
{
    private Conta conta;

    public void criaConta (Evento evento)
    {
        String tipo = evento.getSelecionadoNoRadio("tipo");

        if (tipo.equals("Conta Corrente"))
            this.conta = new ContaCorrente();

        else 
            this.conta = new ContaPoupança();

        this.conta.setAgencia (evento.getString ("agencia"));
        this.conta.setNumero (evento.getInt ("numero"));
        this.conta.setTitular (evento.getString ("titular"));
    }

    public void deposita (Evento evento)
    {
        double valor = evento.getDouble ("valorOperacao");
        this.conta.depositar (valor);
    }

    public void saca (Evento evento)
    {
        double valor = evento.getDouble ("valorOperacao");

        try
        {
            this.conta.sacar (valor);
        } catch (SaldoInsuficienteException | IllegalArgumentException e)
        {
            System.out.println (e.getMessage ());
            e.printStackTrace ();
        }
    }

    public void transfere (Evento evento)
    {
        evento.getSelecionadoNoCombo ("destino");
        this.conta.transfere(conta, evento.getDouble ("valorOperacao"));
    }

    public void ordenaLista (Evento evento)
    {
        List<Conta> contas = evento.getLista ("destino");
        Collections.sort (contas);
    }
}
