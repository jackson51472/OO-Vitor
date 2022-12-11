public class Funcionario extends Pessoa implements IUser {

    private Double salario;
    private CargoFuncionario cargo;

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

    public CargoFuncionario getCargo() {
        return cargo;
    }

    public void setCargo(CargoFuncionario cargo) {
        this.cargo = cargo;
    }

    @Override
    public Boolean autenticar() {
        return  true;
        }
}

