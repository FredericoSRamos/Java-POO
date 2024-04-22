package br.com.caelum.contas.main;

import java.io.PrintStream;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupança;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class Banco 
{
    public static void main (String[] args)
    {
        Conta conta = new ContaCorrente ();

        try
        {
            conta.depositar(9);
        } catch (IllegalArgumentException e)
        {
            System.out.println (e.getMessage());
            e.printStackTrace();
        }

        try
        {
            conta.sacar (12);
        } catch (SaldoInsuficienteException | IllegalArgumentException e)
        {
            PrintStream a = System.out;
            a.println (e.getMessage ());
            e.printStackTrace ();
        }

        conta.setNumero (1);
        conta.depositar (2000);
        conta.setData(12, 2, 1999);

        System.out.println ("\tInformações da conta\n" + "\nTitular: " + conta.getTitular() + "\nNúmero: " + conta.getNumero() + 
                            "\nSaldo: R$" + conta.getSaldo() + "\nData de abertura: " + conta.getData() + "\nIdentificador: " + conta.getIdentificador());

        Conta cc = new ContaCorrente ();
        ContaPoupança cp = new ContaPoupança ();

        System.out.println (cp.getTipo());

        conta.transfere(cc, 200);
    }
}
