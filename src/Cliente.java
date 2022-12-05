import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements  IUser {

    private Boolean vip;
    private Collection<Cliente> clientes = new ArrayList<Cliente>();
    public Collection<Endereco> listaEndereco = new ArrayList<Endereco>();
    public Collection<Conta> listaConta = new ArrayList<Conta>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }




    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }


    public void retornaValidacao(){
        if (this.autenticar() == Boolean.FALSE){
            System.out.println("Cliente Inválido: " + getNome());
        }else{
            System.out.println("Cliente Válido: " + getNome());
        }
    }

    @Override
    public Boolean autenticar() {
        return  true;
    }

        public void imprimirEndereco(Cliente e) {

        Collection<Endereco> enderecoCliente = e.listaEndereco;

        for (Endereco i : enderecoCliente){

            System.out.println("Funcionario "+ e.getNome() +" mora na Cidade: " + i.getCidade() + " CEP: " + i.getCep());

        }
    }
}
