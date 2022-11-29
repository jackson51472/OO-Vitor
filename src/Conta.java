public abstract class Conta {

    private String numeroConta;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public class Debito{
        private Double valor;

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }
    }

    public class Credito{
        private Double valor;

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }
    }

    public Double depositar(Double valorDepositado, String numeroconta){


        return null;
    }

}
