package poo.Exercícios;
public class GatoTeste {
    public static void main (String[] args)
    {
        Gato gato1 = new Gato (), gato2 = new Gato (), gato3 = new Gato();
        gato1.cor = "Vermelho";
        gato1.vivo = true;
        gato1.nome = "Pedro";
        gato1.idade = 5;
        gato2.cor = "Amarelo";
        gato2.vivo = false;
        gato2.nome = "Lima";
        gato2.idade = 6;
        gato3.cor = "Verde";
        gato3.vivo = true;
        gato3.nome = "Antônio";
        gato3.idade = 7;
        gato1.printAtributos();
        gato2.printAtributos();
        gato3.printAtributos();
    }
}
