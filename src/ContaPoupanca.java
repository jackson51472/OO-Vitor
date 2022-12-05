public class ContaPoupanca extends Conta{

    private Double rentabilidadeMensal;

    public ContaPoupanca(String numero, Double valorCaixa) {
        super(numero, valorCaixa);
    }

    public Double calcularSaldo(ContaPoupanca conta){
        Double total = conta.getValorCaixa();

        return total;
    }

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }
}
