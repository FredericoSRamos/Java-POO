package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException {
    
    SaldoInsuficienteException (double valor)
    {
        super ("Saldo insuficiente para sacar o valor de R$" + valor);
    }
}