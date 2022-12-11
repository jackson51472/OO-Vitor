public class Aplicacao1 {

    public static void main(String[] args) {
        Funcionario fun2 = new Funcionario("123.324.675-30","Kalisto", "998785422");
        Funcionario funcs2 = new Funcionario("654.413.908-53","Klaus", "984556721");
        CargoFuncionario aten = new CargoFuncionario("Atendente");
        CargoFuncionario gen = new CargoFuncionario("Gerente");

        fun2.setCargo(aten);
        funcs2.setCargo(gen);

    }

}
