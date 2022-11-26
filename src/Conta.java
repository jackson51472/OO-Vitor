public abstract class Conta {
    private String numero;
    private Double valorCaixa;

    public  Conta(String numero, Double valorCaixa){
        this.numero = numero;
        this.valorCaixa = valorCaixa;
    }

    public class Debito{
        private Double valor;


        public Double depositar(){

            valorCaixa += valor;

            return valorCaixa;
        }
        public Double sacar(){

            if (valor < valorCaixa){
                System.out.println("Você não tem saldo suficiente:");
            }
            else {
                valorCaixa -= valor;
                System.out.println("Você sacou com sucesso:" + valor);
            }


            return valorCaixa;
        }
    }

    public class Credito{

        private Double valor;
        public Double depositar(){

            valorCaixa += valor;

            return valorCaixa;
        }
        public Double sacar(){

            if (valor < valorCaixa){
                System.out.println("Você não tem saldo suficiente:");
            }
            else {
                valorCaixa -= valor;
                System.out.println("Você sacou com sucesso:" + valor);
            }


            return valorCaixa;
        }
    }

}
