package br.com.caelum.contas;

import br.com.caelum.javafx.api.util.Evento;
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
        {
            this.conta = new ContaCorrente();
        }
        else if (tipo.equals("Conta Poupança"))
        {
            this.conta = new ContaPoupança();
        }
        else
        {
            this.conta = new Conta();
        }
        this.conta.setAgencia("1234");
        this.conta.setNumero(56789);
        this.conta.setTitular("Batman");
    }

    public void deposita (Evento evento)
    {
        double valor = evento.getDouble("valorOperacao");
        this.conta.depositar(valor);
    }

    public void saca (Evento evento)
    {
        double valor = evento.getDouble("valorOperacao");

        try
        {
            this.conta.sacar(valor);
        } catch (SaldoInsuficienteException | IllegalArgumentException e)
        {
            System.out.println (e.getMessage ());
            e.printStackTrace ();
        }
    }

    public void transfere (Evento evento)
    {
        evento.getSelecionadoNoCombo("destino");
        this.conta.transfere(conta, 0);
    }
}
