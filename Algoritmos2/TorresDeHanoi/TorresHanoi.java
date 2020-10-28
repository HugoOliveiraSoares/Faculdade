import java.util.Scanner;

public class TorresHanoi {

    private static PilhaDinamica pinoInicial;
    private static PilhaDinamica pinoAuxiliar;
    private static PilhaDinamica pinoDestino;
    private static int nDiscos = 0;
    private static int nMovimentos = 0;

    public static void main(String[] args) {

        pinoInicial = new PilhaDinamica(); // Torre que contem os discos, torre inicial
        pinoAuxiliar = new PilhaDinamica(); // Torre intemediaria, auxiliar
        pinoDestino = new PilhaDinamica(); // Torre final que devera conter os discos empilhados

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de discos: ");
        nDiscos = teclado.nextInt();
        teclado.close();

        for (int i = nDiscos; i > 0; i--) {
            pinoInicial.empilhar(i);
        }

        //Mostra as torres
        imprimeTorre(pinoInicial, pinoAuxiliar, pinoDestino, nDiscos);

        hanoi(pinoInicial, pinoDestino, pinoAuxiliar, nDiscos);
    }

    public static void hanoi(PilhaDinamica pinoOrigem, PilhaDinamica pinoDestino, PilhaDinamica pinoAux, int n) {
        
        if (n > 0) {
            hanoi(pinoOrigem, pinoAux, pinoDestino, n-1);
            mover(pinoOrigem, pinoDestino);
            hanoi(pinoAux, pinoDestino, pinoOrigem, n-1);
        }
    }

    public static void mover(PilhaDinamica pino_Origem, PilhaDinamica pino_Destino) {
        pino_Destino.empilhar(pino_Origem.desempilhar());
        nMovimentos++;
        imprimeTorre(pinoInicial, pinoAuxiliar, pinoDestino, nDiscos);
    }

    public static void imprimeTorre(PilhaDinamica torre1, PilhaDinamica torre2, PilhaDinamica torre3, int nDiscos) {

        System.out.println("\nN movimentos: "+ nMovimentos);
        System.out.println("Pino1\tPino2\tPino3");
        for (int i = 1; i <= nDiscos; i++) {
            System.out.println(torre1.consultarElemento(i) + " \t " + torre2.consultarElemento(i) + " \t "
                    + torre3.consultarElemento(i));
        }
    }
}