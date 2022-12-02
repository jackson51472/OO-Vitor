import java.util.List;

public class Executavel {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("1","Rua A","1", "Caixa", "Paiva", "ff");
        Endereco e2 = new Endereco("2","Rua B","2", "Caixa", "Paiva", "ff");
        Endereco e3 = new Endereco("3","Rua C","3", "Caixa", "Paiva", "ff");
        Endereco e4 = new Endereco("4","Rua D","4", "Caixa", "Paiva", "ff");



//======================================================================================================================
        Cliente c1 = new Cliente("11531630","Jackson","84257066");
        c1.listaEndereco.add(e1);
        c1.listaEndereco.add(e2);
        c1.listaEndereco.add(e3);
        c1.retornaValidacao();
//======================================================================================================================
        Cliente c2 = new Cliente("1223522","Faria","99213245");
        c2.listaEndereco.add(e4);
        c2.listaEndereco.add(e1);
        c2.retornaValidacao();
//======================================================================================================================
        Funcionario f1 = new Funcionario("3242","Gustavo","8865312");
        f1.retornaValidacao();

//======================================================================================================================
        Debito d1 = new Debito();
        d1.setValor(300.);

        Credito cr1 = new Credito();
        cr1.setValor(300.);
//======================================================================================================================
        ContaCorrente cc1 = new ContaCorrente("444",2000.);
        cc1.setLimite(2900.);

        ContaCorrente cc2 = new ContaCorrente("123" , 1250.);
        cc2.setLimite(1200.);

        ContaCorrente cc3 = new ContaCorrente("123" , 2500.);
        cc2.setLimite(3000.);

        c2.listaConta.add(cc1);
        c2.listaConta.add(cc3);

        c1.listaConta.add(cc2);

        System.out.println("=========================================================================================================================");

        cc1.transferir(cc2 , cc1,500.);
        System.out.println(cc1.getValorCaixa());//CERTO

        System.out.println(cc2.getValorCaixa());//CERTO

        System.out.println("=========================================================================================================================");







    }

}
