package poo.provas.P2.Primeiro2018;

import java.util.Scanner;

public class PrincipalCompras
{
    public static void main (String[] args)
    {
        CarrinhoDeCompras carrinho_de_compras = new CarrinhoDeCompras();

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < 3; i++)
        {
            System.out.println ("Insira o ID do livro " + (i + 1) + ":");

            String id = sc.nextLine();

            Livro livro = new Livro (id);
            carrinho_de_compras.inserir(livro);
        }

        Utils.frequencia(carrinho_de_compras);

        sc.close();
    }
}
