package model;

public class ClienteOuro extends Cliente {

//    public ClienteOuro(Cliente cliente) {
//        setCpf(cliente.getCpf());
//        setNome(cliente.getNome());
//        setIdade(cliente.getIdade());
//        setDesconto(0.20f);
//    }

    @Override
    public ClienteOuro(int cpf, String nome, int idade) {
        super(cpf, nome, idade);
        setDesconto(0.20f);
    }
}
