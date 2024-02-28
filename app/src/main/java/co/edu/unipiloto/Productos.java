package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;

public class Productos {

    List<String> getBrand(String spinner){
        List<String> brands = new ArrayList<String>();
        if(spinner.equals("Mercancia Liquida")){
            brands.add("Agua");
            brands.add("Petroleo");
            brands.add("Gasolina");
            brands.add("Aceite");
            brands.add("Aceite Vegetal");
        }
        if(spinner.equals("Mercancia Solida")){
            brands.add("Tierra");
            brands.add("Piedra");
            brands.add("Acero");
            brands.add("Carbon");
            brands.add("Madera");
        }
        if(spinner.equals("Mercancia Agricola")){
            brands.add("Cafe-Granel");
            brands.add("Cafe-Bulto");
            brands.add("Avena-Granel");
            brands.add("Avena-Bulto");
            brands.add("Cebada-Granel");
            brands.add("Cebada-Bulto");
        }
        if(spinner.equals("N/A")){
            brands.add("Categoria no Seleccionada");
        }
        return brands;
    }
}