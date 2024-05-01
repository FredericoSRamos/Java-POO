package br.com.caelum.contas.modelo;

import java.util.HashSet;
import java.util.Set;

public class TestaHashSet {
    public static void main (String[] args)
    {
        Set<Conta> set = new HashSet<>();

        Conta c1 = new ContaCorrente ();
        c1.setAgencia("123");
        c1.setNumero(1);

        Conta c2 = new ContaCorrente ();
        c2.setAgencia("123");
        c2.setNumero(1);

        set.add (c1);
        set.add (c2);

        System.out.println (set.size());
}
}
