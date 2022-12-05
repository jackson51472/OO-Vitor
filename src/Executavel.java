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
//                                              CLIENTE

        Cliente c2 = new Cliente("1223522","Faria","99213245");
        c2.listaEndereco.add(e4);
        c2.listaEndereco.add(e1);
        c2.retornaValidacao();
//======================================================================================================================
//                                     FUNCIONARIO E CARGOFUNCIONARIO

        CargoFuncionario cargo = new CargoFuncionario("Gerente");
        CargoFuncionario cargoDois = new CargoFuncionario("Atendente");

        Funcionario f1 = new Funcionario("3242","Gustavo","8865312");
        Funcionario f2 = new Funcionario("4422","Alex","99887766");

        f1.setFuncs(cargo);
        f2.setFuncs(cargoDois);
        f1.retornaValidacao();

//======================================================================================================================
//                                          DEBITO E CREDITO
        Debito d1 = new Debito();
        d1.setValor(300.);

        Credito cr1 = new Credito();
        cr1.setValor(300.);
//======================================================================================================================
//                                      CONTA CORRENTE E POUPANÇA

        ContaCorrente cc1 = new ContaCorrente("444",2000.);
        cc1.setLimite(2900.);

        ContaCorrente cc2 = new ContaCorrente("123" , 1250.);
        cc2.setLimite(1200.);

        ContaPoupanca cp3 = new ContaPoupanca("222" , 2500.);
        cp3.setRentabilidadeMensal(0.03);

        c2.listaConta.add(cc1);
        c2.listaConta.add(cp3);

        c1.listaConta.add(cc2);
//======================================================================================================================

        c1.listaConta.add(cc1);
        c1.listaConta.add(cc2);
        c2.listaConta.add(cp3);

//======================================================================================================================



        System.out.println("=========================================================================================================================");

        cc2.sacar(d1.getValor());
        cc2.debito.add(d1);

        cc2.depositar(cr1.getValor());
        cc2.credito.add(cr1);


        cp3.transferir(cc2 , cp3,1250.);


        System.out.println("Saldo total da conta " + cc1.getNumero() + ": " + cc1.calcularSaldo(cc1));//(cc1)2000 + (Limite) 2900 = 4900//CERTO

        System.out.println("Saldo total da conta " + cc2.getNumero() + ": " + cc2.calcularSaldo(cc2));//(cc2)1250 + (transferencia)1250 + (Limite) 1200= 3700 //CERTO

        System.out.println("Saldo total da conta " + cp3.getNumero() + ": " + cp3.calcularSaldo(cp3));//(cp3)2500 - (transferencia)1250 = 1250 //CERTO

        System.out.println("=========================================================================================================================");


        c1.imprimirEndereco(c1);
        c2.imprimirEndereco(c2);

    }
}
