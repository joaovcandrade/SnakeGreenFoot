public class Fila<T>
{
    private T primeiro;
    private T ultimo;    
    private int size;

    public Fila(){
        this.size = 0;
    }
    
    public void enfileirar(T c)
    {
        if(size == 0){
            primeiro = c;
            ultimo = c;
        }else{
            //ultimo.setProximo(c);
            ultimo = c;
        }
        size ++;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public T getPrimeiro(){
        return this.primeiro;
    }
    
    public T getUltimo(){
        return this.ultimo;
    }
}
