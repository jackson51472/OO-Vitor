public class ContaCorrente extends Conta {
    private Double limite;

    public ContaCorrente(String numero, Double valorCaixa) {
        super(numero, valorCaixa);
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }


    public Double calcularSaldo(ContaCorrente conta){
        Double total = conta.getValorCaixa();




        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total + limite;
    }
}
