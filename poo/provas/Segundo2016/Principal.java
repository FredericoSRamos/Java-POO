package poo.provas.Segundo2016;

import java.text.DecimalFormat;

public class Principal {
    public static void main (String[] args)
    {
        Loja loja = new Loja ();
        loja.setId(1);
        loja.setNome("Loja 1");

        Carro carro = new Carro (50000, 123);
        Liquidificador liquidificador = new Liquidificador(100, 422);
        Chocolate chocolate = new Chocolate(8, 677);

        carro.setPlaca ("XYZ-1234");
        liquidificador.setMarca ("Arno");
        chocolate.setTipo ("LaCreme");

        loja.adicionarAoEstoque(chocolate);
        loja.adicionarAoEstoque(liquidificador);
        loja.adicionarAoEstoque(carro);

        Cliente cliente = new Cliente ();

        cliente.setCpf ("123.456.789-33");

        cliente.comprar(loja, carro);
        cliente.comprar(loja, chocolate);

        DecimalFormat formatter = new DecimalFormat ("#0.00");

        System.out.println ("Faturamento bruto: " + formatter.format (loja.faturamentoBruto()));
        System.out.println ("Quantidade de produtos vendidos: " + loja.quantidadeProdutosVendidos ());
        System.out.println ("Quantidade de produtos ligáveis vendidos: " + loja.quantidadeProdutosLigaveisVendidos());

        loja.imprimirRelatorioVenda();

        for (Object i : loja.getEstoque())
        {
            System.out.println (i);
        }
    }
}
