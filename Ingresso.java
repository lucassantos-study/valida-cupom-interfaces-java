public class Ingresso implements Validavel{
    private String codigo;

    public Ingresso(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }

    @Override 
    public boolean validar(String codigo){
        return this.codigo.equals(codigo);
    }

}
