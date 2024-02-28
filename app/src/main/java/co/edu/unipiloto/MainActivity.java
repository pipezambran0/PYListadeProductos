package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Productos productos = new Productos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMercancias(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String selectedMercancia = String.valueOf(spinner.getSelectedItem());

        List<String> brandList = productos.getBrand(selectedMercancia);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandList){
            brandsFormatted.append(brand).append('\n');
        }

        TextView brands = (TextView) findViewById(R.id.textView);
        brands.setText(brandsFormatted);

    }
}