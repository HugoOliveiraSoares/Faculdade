class HashCelula{

    protected Object chave; // armazenador de um item 
    protected HashCelula link; // referencia para outro item

    // Cosntrutor inicialmente vazio
    public HashCelula() {
        this(null);
    }

    // Construtor com valor inicial
    public HashCelula ( String valor){
        chave = valor;
        link = null;
    }

    // Comparar o valor do objeto atual com o do parametro com valor inicial
    public int compareTo(Object valor) {
        String chaveAtual = chave.toString();
        String chaveValor = valor.toString();
        return chaveAtual.compareTo(chaveValor);
    }

    // Converter conteudo da classe para String
    public String toString() {
        return chave.toString();
    }

}

public class HashTable {

    protected int capacidade; // capacidade maxima de objetos na tabela
    protected int contador; // contador de itens na tabela
    protected HashCelula[] hashArray; // armazenador de objetos
    protected boolean enderecoAberto; // endereçamento aberto(true) ou (false)
    protected boolean useReHash;

    // Construtor com armazenador com 10 posições
    public HashTable(){
        this(10);
    }

    // Construtor com capacidade maxima especificada
    public HashTable(int maxCapacidade) {
        contador = 0;
        enderecoAberto = false;
        useReHash = false;
        capacidade = maxCapacidade;
        hashArray = new HashCelula[capacidade];
    }

    // Função Hash para calcular o endereçamento a partir da chave
    public int funcaoHash(Object valor, int max) {
        return Integer.parseInt(valor.toString()) % max;
    }

    // Testar se tabela Hash vazia
    public boolean vazia() {
        return contador == 0;
    }

    // Quantidade de itens na tabela
    public int tamanho(){
        return contador;
    }

    // Habilitar/Desabilitar endereçamento aberto
    public void enderecoAbertoOn() {
        enderecoAberto = true;
    }

    public void enderecoAbertoOff() {
        enderecoAberto = false;
    }

    // Habilitar/Desabilitar uso de rehash
    public void useReHashOn() {
        useReHash = true;
    }

    public void useReHashOff() {
        useReHash = true;
    }

    // Recalcular a proxima posição na tabela
    public int rehash(int valor) {
        return (valor + capacidade - 1) % capacidade;
    }

    // Testar se posicao valida
    protected boolean chaveValida(int k){
        return 0 <= k && k < capacidade;
    }

    // Indicar a proxima posição na tabela
    public int proximo(int valor){
        int x;
        
        if (useReHash) 
            x = rehash(valor);
        else 
            x = (valor + 1) % capacidade;
        
        return x;
    }

    // Inserir dado na tabela

    public void inserir(String valor) {
        int k = 0;
        k = funcaoHash(valor, capacidade);
        inserir(valor, k);
    }

    public void inserir(String valor, int k) {
        if (!chaveValida(k)) {
            System.out.println("Erro: Indice invalido!");
        } else {
            if (hashArray[k] == null) {
                hashArray[k] = new HashCelula(valor);
                contador++;
            } else {
                if (enderecoAberto) {
                    inserirAberto(valor, k);
                } else {
                    inserirLink(valor, k);
                }
            }
        }
    }

    // Inserir dado na tabela com endereçamento aberto
    private void inserirAberto(String valor, int k) {
        int n = proximo(k);
        while (n != k && (hashArray[n] != null))
            n = proximo(n);
        if (n == k) {
            System.out.println("Erro: Capacidade da Hash foi excedida!");
        } else {
            hashArray[n] = new HashCelula(valor);
            contador++;
        }
    }

    // Inserir dado na tabela com endereçamento em separado
    private void inserirLink(String valor, int k) {
        HashCelula x;
        x = new HashCelula(valor);
        x.link = hashArray[k].link;
        hashArray[k].link = x;
        contador++;
    }

    // Retirar dado na tabela

    public void retirar(String valor) {
        int k = 0;
        k = funcaoHash(valor, capacidade);
        retirar(valor, k);
    }

    public void retirar(String valor, int k) {
        if (vazia()) {
            System.out.println("Erro: Tabela Hash vazia!");
        } else {
            if (!chaveValida(k)) {
                System.out.println("Erro: Indice invalido!");
            } else {
                HashCelula anterior = null;
                HashCelula x = hashArray[k];
                boolean result = valor.equals(x.toString());
                if (result) { // Item está na posição direta na Hash
                    if (enderecoAberto)
                        hashArray[k] = null;
                    else
                        hashArray[k] = x.link;
                    contador--;
                } else { // Item não está na posição direita na Hash
                    if (enderecoAberto) {
                        int n = proximo(k);
                        while (n != k && !result) {
                            x = hashArray[n];
                            if(x == null)
                                n = k;
                            else{
                                result = valor.equals(x.toString());
                                if (!result)
                                    n = proximo(n);
                            }
                        }
                        if(n == k && !result)
                            System.out.println("Erro: Item inexistente!");
                        else{
                            hashArray[n] = null;
                            contador--;
                        }
                    } else{ // Item está no encadeamento
                        while (x != null && !result) {
                            anterior = x;
                            x = x.link;
                            if (x != null)
                                result = valor.equals(x.toString());
                        }
                        if (x != null) {
                            anterior.link = x.link;
                            contador--;
                        }else
                            System.out.println("Erro: Item inexistente!");
                    }
                }
            }
        }
    }

    // Procurar valor na tabela
    public boolean pesquisar(String valor, int k) {
        boolean result = false;
        int n = 0;
        HashCelula x;
        if (!chaveValida(k))
            System.out.println("Erro: Indice invalido!");
        else {
            x = hashArray[k];
            if (x != null) {
                result = valor.equals(x.toString());
                if (enderecoAberto) {
                    n = proximo(k);
                    while (n != k && !result) {
                        x = hashArray[n];
                        if (x == null) {
                            n = k;
                        } else {
                            result = valor.equals(x.toString());
                            if (!result)
                                n = proximo(n);
                        }
                    }
                } else { // Endereçamento por link encadeado
                    x = x.link;
                    while (x != null && !result) {
                        result = valor.equals(x.toString());
                        if (!result)
                            x = x.link;
                    }

                }
            } 
        }
        return result;
    }

    //Converter conteudo da classe para String com percorrimento em ordem
    public String toString() {
        String fullHash = "";
        HashCelula x;
        for (int i = 0; i < capacidade; i++) {
            x = hashArray[i];
            if (x != null) {
                fullHash += "\n" + String.valueOf(i) + ". ( ";
                fullHash += x.toString();
                x = x.link;
                while (x != null) {
                    fullHash += " " + x.toString();
                    x = x.link;
                }
                fullHash += " )";
            }
        }
        return fullHash;
        
    }

}