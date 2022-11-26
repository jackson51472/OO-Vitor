import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;

public class Funcionario extends Pessoa implements IUser {

    private Double salario;
    private Collection<Funcionario> funcs = new ArrayList<Funcionario>();

    public Funcionario(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public void retornaValidacao(){
        if (this.autenticar() == Boolean.FALSE){
            System.out.println("CPF Inválido:" + this.getCpf());
        }else{
            System.out.println("CPF válido:" + this.getCpf());
        }

    }

    public Collection<Funcionario> getFuncs() {
        return funcs;
    }

    public void setFuncs(Collection<Funcionario> funcs) {
        this.funcs = funcs;
    }

    @Override
    public Boolean autenticar() {
            if (this.getCpf() == null)
                return false;


            if (this.getCpf().equals("00000000000") || this.getCpf().equals("11111111111") || this.getCpf().equals("22222222222") ||
                    this.getCpf().equals("33333333333") || this.getCpf().equals("44444444444") || this.getCpf().equals("55555555555")
                    || this.getCpf().equals("66666666666") || this.getCpf().equals("77777777777") || this.getCpf().equals("88888888888")
                    || this.getCpf().equals("99999999999") || (this.getCpf().length() != 11))
                return(false);

            char dig10,
                    dig11;

            int sm, i, r, num, peso;

            try {

                sm = 0; peso = 10; for (i=0; i<9; i++) {

                    num = (int)(this.getCpf().charAt(i) - 48);
                    sm = sm + (num * peso);
                    peso = peso - 1;

                }
                r = 11 - (sm % 11);
                if ((r == 10) || (r == 11))
                    dig10 = '0';
                else dig10 = (char)(r + 48);

                sm = 0;
                peso = 11;
                for(i=0; i<10; i++) {
                    num = (int)(this.getCpf().charAt(i) - 48);
                    sm = sm + (num * peso);
                    peso = peso - 1;
                }
                r = 11 - (sm % 11);
                if ((r == 10) || (r == 11))
                    dig11 = '0';
                else dig11 = (char)(r + 48);

                if ((dig10 == this.getCpf().charAt(9)) && (dig11 == this.getCpf().charAt(10)))
                    return(true);

                else
                    return(false);

            } catch (InputMismatchException erro) {
                return(false);
            }
        }
}

