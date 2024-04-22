package poo.Exercícios;

public class Novo extends Imovel {
    @Override
    public double getPreço ()
    {
        return super.getPreço() * 1.1;
    }
}
