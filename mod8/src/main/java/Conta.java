/**
 * essa calsse conta eu fiz apenas para concretizar os ensinos do modulo 8 da EBAC
 * e testa todos os tipo ptimitivos de numeros para praticar
 * @author Vilnei
 */
public class Conta {
    private byte bit = 1;
    private short curto = 2;
    private int inteiro = 3;
    private long longo = 4;
    private float flutuante = 11.05f;
    private double flutuanteDois = 10.00;


    public double somaTudo() {
        double total = bit + curto + inteiro + longo + flutuanteDois - flutuante;
        return total;
    }
    public long somaValoresInteiros() {
        long total = bit + curto + inteiro + longo;
        return total;
    }
    public double somaValoresFlutuantes() {
        double total = flutuante + flutuanteDois;
        return total;
    }
    public double mediaDeTodosOsValores() {
        double total = bit + curto + inteiro + longo + flutuanteDois + flutuante;
        double totalFinal = total / 6;
        return totalFinal;
    }
    public double mediaDeValoresFlutuantes() {
        double total = flutuante + flutuanteDois;
        double totalFinal = total / 2;
        return totalFinal;
   }
   public long mediaDeValoresInteiros() {
        long total = bit + curto + inteiro + longo;
        long totalFinal = total / 4;
        return totalFinal;
   }

}
