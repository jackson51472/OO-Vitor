import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.List;

public class Cliente extends Pessoa implements  IUser {

    private Boolean vip;
    private Collection<Cliente> clientes = new ArrayList<Cliente>();
    public ArrayList<Endereco> listaEndereco = new ArrayList<Endereco>();
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

    public List<Endereco> getListaEndereco(ArrayList<Endereco> listaEndereco) {
        return listaEndereco;
    }

    public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
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
}
