public class Main {
    public static void main(String[] args){

        Cupom cupom = new Cupom("RTX3090");
        Ingresso ingresso = new Ingresso("LUCAS1127");

        System.out.println("______ TESTANDO CUPOM ______");
        String codigoTestadoCupom = "RTX3090";
        boolean cupomValido = cupom.validar(codigoTestadoCupom);
        
        if(cupomValido){
            System.out.println("O cupom " + codigoTestadoCupom + " é válido!");
        } else {
            System.out.println("O cupom não é válido!");
        }
        System.out.println("");


        String codigoInvalido = "RTX400";
        boolean cupomInvalido = cupom.validar(codigoInvalido);
        
        if(cupomInvalido){
            System.out.println("O cupom " + codigoInvalido + " é válido!");
        } else {
            System.out.println("O cupom " + codigoInvalido + " não é válido!");
        }
        
        System.out.println("");
        
        
        System.out.println("______ TESTANDO INGRESSO ______");
        String codigoTestadoIngresso = "LUCAS1127";
        boolean ingressoValido = ingresso.validar(codigoTestadoIngresso);

        if(ingressoValido){
            System.out.println("O ingresso " + codigoTestadoIngresso + " é válido!");
        } else{
            System.out.println("O ingresso não é válido!");
        }
        System.out.println("");


        String ingressoInvalido = "LUCAS1130";
        boolean codIngressoInvalido = ingresso.validar(ingressoInvalido);

        if(codIngressoInvalido){
            System.out.println("O ingresso " + ingressoInvalido + " é válido!");
        } else{
            System.out.println("O ingresso " + ingressoInvalido + " não é válido!");
        }
        System.out.println("");

    }
}
