package model;

public class ClientePlatinum extends Cliente{

    public ClientePlatinum(Cliente cliente) {
        setCpf(cliente.getCpf());
        setNome(cliente.getNome());
        setIdade(cliente.getIdade());
        setDesconto(0.30f);
    }

    
}
