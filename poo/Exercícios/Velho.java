package poo.Exercícios;

public class Velho extends Imovel{
    @Override
    public double getPreço ()
    {
        return super.getPreço() * 0.9;
    }
}
