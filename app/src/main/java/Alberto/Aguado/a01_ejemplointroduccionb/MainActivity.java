package Alberto.Aguado.a01_ejemplointroduccionb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// variables de la interfaz
    private TextView txtcontador;
    private Button btnPulsar;
    //variables para la logica
    private int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //to_do ira aqui detras
        inicializas();
        btnPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                txtcontador.setText("pulsado "+contador+" veces");
            }
        });
    }
        private void inicializas() {
            contador = 0;
            txtcontador = findViewById(R.id.txtContadorMain);
            btnPulsar = findViewById(R.id.btnPulsarMain);
        }

}