package poo.provas.P2.Segundo2018;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Utils
{
    public static boolean existe (List<Aluno> x, Aluno y)
    {
        return x.contains(y);
    }

    public static void ordena (List<Aluno> x)
    {
        Collections.sort(x);
    }

    public Map<String, Aluno> retornaDados (Set<String> conjuntoAlunos)
    {
        Map<String, Aluno> mapa = new HashMap<>();

        Iterator<String> iterator = conjuntoAlunos.iterator();

        while (iterator.hasNext())
        {
            String[] dados = iterator.next().split("#");

            Aluno aluno;

            if (dados[3].equals("E"))
                aluno = new AlunoEspecial (dados[0]);
            else if (dados[3].equals("R"))
                aluno = new AlunoRegular (dados[0]);
            else
                throw new RuntimeException();

            aluno.setNome(dados[1]);
            aluno.setNota(Double.parseDouble(dados[2]));

            mapa.put (dados[0], aluno);
        }

        return mapa;
    }
}
