package poo.Exercícios;

public class TestarContaBancaria {
    public static void main (String[] args)
    {
        ContaBancaria conta = new ContaBancaria ();

        conta.setDataAbertura(5, 7, 2009);
        System.out.println (conta.getDataAbertura());
        conta.setSaldo(1223309);
        System.out.println(conta.getSaldoFormatado());
    }
}
