import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Random;

public class TestaLista {
    public static void main (String[] args)
    {
        ArrayList<Conta> lista = new ArrayList<Conta> ();

        for (int i = 0; i < 5; i++)
        {
            lista.add (new ContaCorrente());
            lista.get(i).setTitular("Oi");
            lista.get(i).setAgencia("Ola");
            lista.get (i).depositar(new Random().nextInt(1000));
            System.out.println(lista);
        }
    }
}
