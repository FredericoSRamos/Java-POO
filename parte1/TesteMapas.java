import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteMapas {
    public static void main (String[] args)
    {
        Conta c1 = new ContaCorrente();
        c1.depositar (1000);

        Conta c2 = new ContaCorrente();
        c2.depositar (2000);

        Map<String, Conta> mapa = new HashMap<String, Conta> ();

        mapa.put ("diretor", c1);
        mapa.put ("gerente", c2);

        Conta contaDoDiretor = (Conta) mapa.get ("diretor");
        System.out.println ("Saldo do diretor: " + contaDoDiretor.getSaldo ());
    }
}
