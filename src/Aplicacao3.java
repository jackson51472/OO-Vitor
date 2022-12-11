public class Aplicacao3 {

    public static void main(String[] args) {

        Cliente clien = new Cliente("123.324.675-30","Kalisto", "998785422");

        ContaCorrente conc1 = new ContaCorrente("404",0.0,0.);
        Credito cred1 = new Credito(100.);
        Credito cred2 = new Credito(100.);
        Credito cred3 = new Credito(100.);

        conc1.depositar(cred1.getValor());
        conc1.depositar(cred2.getValor());
        conc1.depositar(cred3.getValor());

        conc1.credito.add(cred1);
        conc1.credito.add(cred2);
        conc1.credito.add(cred3);

        clien.listaConta.add(conc1);

        Debito debi = new Debito(50.);

        conc1.debito.add(debi);

        conc1.sacar(debi.getValor());


        System.out.println("Conta número " + conc1.getNumero() + " Tem o Saldo de : R$" + conc1.calcularSaldo(conc1) + ", ja está com limite de : R$" + conc1.getLimite());

    }

}
