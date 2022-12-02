public abstract class Conta {
    private String numero;
    private Double valorCaixa;

    private Credito credito;
    private Debito debito;

    public  Conta(String numero, Double valorCaixa){
        this.setNumero(numero);
        this.setValorCaixa(valorCaixa);
    }

    public Double depositar(Double valor){

        this.valorCaixa += valor;

        return this.valorCaixa;
    }

    public Double sacar(Double valor){

        if (valor > this.valorCaixa || valor > this.valorCaixa){
            System.out.println("Você não tem esse saldo:");
            return this.valorCaixa;
        }else
            valorCaixa -= valor;
            return  this.valorCaixa;

    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(Double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}
