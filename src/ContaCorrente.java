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
