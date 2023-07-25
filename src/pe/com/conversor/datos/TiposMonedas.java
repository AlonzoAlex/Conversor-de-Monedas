
package pe.com.conversor.datos;

import java.util.*;

public class TiposMonedas {
    //creacion de matriz de 6 x 6          
    //Array: orden SOl , dolar, euros, libras esterlinas, yen, won
    private String []tiposMonedas = {"Soles", "Dolares", "Euros", "Libras Esterlinas", "Yenes", "Wones"};
    
    private ArrayList<Object> cambioSol = new ArrayList<>(
    Arrays.asList(1,0.28,0.25,0.22, 39.38, 356.53));
    
    private ArrayList<Object> cambioDolar = new ArrayList<>(
    Arrays.asList(3.59, 1, 0.9, 0.78,141.48,1280.84));
    
    private ArrayList<Object> cambioEuro = new ArrayList<>(
    Arrays.asList(3.98,1.11,1,0.86,156.55,1417.31));
    
    private ArrayList<Object> cambioLibra = new ArrayList<>(
    Arrays.asList(4.61,1.28,1.16,1,181.37,1642.04));
    
    private ArrayList<Object> cambioYen = new ArrayList<>(
    Arrays.asList(0.025,0.0071,0.0064,0.0055,1,9.05));
    
    private ArrayList<Object> cambioWon = new ArrayList<>(
    Arrays.asList(0.0028,0.00078,0.00071,0.00061,0.11,1));
    
    private ArrayList<Object> tablaCambios = new ArrayList<>(
    Arrays.asList(cambioSol,cambioDolar,cambioEuro,cambioLibra,cambioYen,cambioWon));

    public String[] getTiposMonedas() {
        return tiposMonedas;
    }
   
    public double getTipoCambio(int index1, int index2){
        ArrayList<Object> tipoCambios = (ArrayList<Object>)tablaCambios.get(index1);
        return (Double)tipoCambios.get(index2);
    }
    
}
