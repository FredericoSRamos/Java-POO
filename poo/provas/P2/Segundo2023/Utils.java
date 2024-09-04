package poo.provas.P2.Segundo2023;

import java.util.Set;
import java.util.regex.Pattern;

public class Utils
{
    public static void verifica (String texto) throws TextoCurtoException
    {
        if (texto.length() < 10)
            throw new TextoCurtoException(texto.length());
    }

    public static String moderar (String texto)
    {
        Set<String> set = Utilidades.getPalavroes();

        for (String str : set)
        {
            String censura = "";
            for (int i = 0; i < str.length(); i++)
            {
                censura += "#";
            }

            texto = Pattern.compile(str, Pattern.CASE_INSENSITIVE).matcher(texto).replaceAll(censura);
        }

        return texto;
    }
}
