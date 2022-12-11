public class Aplicacao2 {

    public static void main(String[] args) {

        Cliente clien = new Cliente("123.324.675-30","Kalisto", "998785422");
        Endereco e1 = new Endereco("1","Rua A","1", "Caixa", "Paiva", "ff");
        Endereco e2 = new Endereco("2","Rua B","2", "Caixa", "Paiva", "ff");
        Endereco e3 = new Endereco("3","Rua C","3", "Caixa", "Paiva", "ff");

        clien.listaEndereco.add(e1);
        clien.listaEndereco.add(e2);
        clien.listaEndereco.add(e3);

        clien.imprimirEndereco(clien);

    }

}
