package poo.provas.P2.Primeiro2018B;

import java.util.Scanner;

public class PrincipalCompras
{
    public static void main (String[] args)
    {
        CarrinhoDeCompras carrinho_de_compras = new CarrinhoDeCompras();

        Scanner sc = new Scanner (System.in);

        for (int i = 1; i < 4; i++)
        {
            System.out.println ("Insira o ID do livro " + i + ":");
            
            Livro livro = new Livro (sc.nextLine());

            carrinho_de_compras.inserir(livro);
        }

        Utils.frequencia(carrinho_de_compras);

        sc.close();
    }
}
