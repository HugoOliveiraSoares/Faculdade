package model;

public class ClientePrata extends Cliente{

    public ClientePrata(Cliente cliente) {
        setCpf(cliente.getCpf());
        setNome(cliente.getNome());
        setIdade(cliente.getIdade());
        setDesconto(0.10f);
    }
}
