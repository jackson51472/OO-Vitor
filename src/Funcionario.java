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
            System.out.println("Funcionario Inválido: " + getNome());
        }else{
            System.out.println("Funcionario Válido: " + getNome());
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
        return  true;
        }
}

