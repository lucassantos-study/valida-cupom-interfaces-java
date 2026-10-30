public class Cupom implements Validavel{
    private String codigo;

    public Cupom(String codigo){
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
