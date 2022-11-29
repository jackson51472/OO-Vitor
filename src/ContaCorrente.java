public class ContaCorrente {

    private Double limite;
    private Double saldo;

    public void calcularSaldo(){

        System.out.println("Valor em caixa;" + getSaldo());

    }

    public void depositar(String numeroConta, Double valor){
        
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
