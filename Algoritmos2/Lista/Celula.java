public class Celula {
    
    Object item; // armazenar de objeto
    Celula link; // referencia para outra Celula (objeto)

    public Celula(){
        item = null;
        link = null;
    }

    public Celula(Object valorItem){
        item = valorItem;
        link = null;
    }

    public Celula(Object valorItem, Celula linkCelula){
        item = valorItem;
        link = linkCelula;
    }

}
