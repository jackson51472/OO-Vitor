public class ContaCorrente extends Conta {
    private Double limite;

    public ContaCorrente(String numero, Double valorCaixa, Double limite) {
        super(numero, valorCaixa);
        this.setLimite(limite);

    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }


    public Double calcularSaldo(ContaCorrente conta){
        Double total = 0.0;


        for (Credito e : credito){
            total += e.getValor();
        }

        for (Debito e : debito){
            total -= e.getValor();

        }

        return total + conta.limite;
    }

    public Object[] transferir (Conta contaAlvo, Conta contaEnviadora, Double valorTransferido ){

        if (valorTransferido > contaEnviadora.getValorCaixa()){
            System.out.println("Conta número "+ getNumero() +" Sem saldo");
        }
        else {
            Double valorDois = valorTransferido;

            valorDois += contaAlvo.getValorCaixa();
            contaAlvo.setValorCaixa(valorDois);

            contaEnviadora.setValorCaixa(getValorCaixa() - valorTransferido);
        }

        Object[] o = {contaAlvo , contaEnviadora};

        return o;
    }
}
