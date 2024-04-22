public class PessoaFísica {
    private String cpf;

    PessoaFísica (String cpf)
    {
        if (valida(cpf))
            this.cpf = cpf;
        else
            throw new IllegalArgumentException("CPF inválido");
    }

    PessoaFísica ()
    {
        throw new IllegalArgumentException("Pessoa precisa ter um CPF");
    }

    static boolean valida (String cpf)
    {
        if (cpf.length() == 11)
            return true;

        return false;
    }

    String getCPF ()
    {
        return this.cpf;
    }
}
