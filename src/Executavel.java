import java.util.List;

public class Executavel {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("1","Rua A","1", "Caixa", "Paiva", "ff");
        Endereco e2 = new Endereco("2","Rua B","2", "Caixa", "Paiva", "ff");
        Endereco e3 = new Endereco("3","Rua C","3", "Caixa", "Paiva", "ff");
        Endereco e4 = new Endereco("4","Rua D","4", "Caixa", "Paiva", "ff");




        Cliente c1 = new Cliente("11519331630","Jackson","84257066");
        c1.listaEndereco.add(e1);
        c1.listaEndereco.add(e2);
        c1.listaEndereco.add(e3);
        c1.retornaValidacao();

        Cliente c2 = new Cliente("1223522","Faria","99213245");
        c2.listaEndereco.add(e4);
        c2.listaEndereco.add(e1);
        c2.retornaValidacao();

        Funcionario f1 = new Funcionario("3242","Gustavo","8865312");
        f1.retornaValidacao();



    }
}
