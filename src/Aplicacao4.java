public class Aplicacao4 {

    public static void main(String[] args) {

        Cliente clien1 = new Cliente("123.324.675-30","Kalisto", "998785422");
        Cliente clien2 = new Cliente("434.656.316-33","Moura", "998762412");

        ContaCorrente conc1 = new ContaCorrente("555",0.,0.);
        Credito cred1 = new Credito(1000.);
        conc1.depositar(cred1.getValor());
        conc1.credito.add(cred1);

        ContaPoupanca conp = new ContaPoupanca("232", 0.0, 0.001);
        Credito cred2 = new Credito(1000.);
        conp.depositar(cred2.getValor());
        conp.credito.add(cred2);


        Debito trans = new Debito(500.);
        conc1.debito.add(trans);
        conc1.transferir(conp,conc1,trans.getValor());

        System.out.println("Conta número " + conc1.getNumero() + " Tem o Saldo de : R$" + conc1.calcularSaldo(conc1) + ", ja está com limite de: R$" + conc1.getLimite());
        System.out.println("Conta número " + conp.getNumero() + " Tem o Saldo de : R$" + conp.calcularSaldo(conp) + ", é tem uma rentabilidade mensal de: " + conp.getRentabilidadeMensal());



    }

}
