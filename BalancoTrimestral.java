package gastototal;

/**
 *
 * @author pedro
 */
public class BalancoTrimestral {

    public static void main(String[] args) {
        float janeiro = 15000, fevereiro = 23000, marco = 17000, orcamento = 50000, gastosTrimestre;
        
        gastosTrimestre = (janeiro + fevereiro + marco);
        
        System.out.println("Valor dos gastos: " + gastosTrimestre);
        
        if(gastosTrimestre > orcamento){
            System.out.println("Estourou o orcamento!");
        } else{
            System.out.println("Dentro do orcamento.");
        }
    }
    
}
