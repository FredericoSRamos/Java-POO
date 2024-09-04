package poo.provas.P2.Segundo2023;

public class TextoCurtoException extends Exception
{
    public TextoCurtoException(int tamanho)
    {
        super ("Texto inserido com " + tamanho + " caracteres.");
    }
}
