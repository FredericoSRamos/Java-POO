

import java.text.DecimalFormat;

import br.com.caelum.contas.modelo.Conta;

public class TestaArrays {
    public static void main (String[] args)
    {
        Conta[] arr = new Conta[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i] = new Conta();
            arr[i].depositar((i + 1) * 100.0);
        }

        double total = 0;
        for (Conta i : arr)
        {
            total += i.getSaldo();
        }

        DecimalFormat formatter = new DecimalFormat ("#0.00");

        System.out.println ("Média dos saldos: R$" + formatter.format (total / arr.length));
    }
}
