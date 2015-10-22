package unam.isivroes.com.pruebaandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.view;
import android.widget.TextView;
import java.util.Random;

public class ActivityOmar extends AppCompatActivity {
    private TextView resultado;
    private String [] saludos = {"Hola", "Adiós", "Buenos días", "Buenas tardes", "Buenas noches", "Dulces sueños", "Descansa bien", "Hasta pronto", "Cuídate"}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_omar);
        this.resultado = (TextView) findViewById(R.id.etiqueta_saludo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_omar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void saludo(View view) {
        Random aleatorio = new Random();
        this.resultado.setText(this.saludos[aleatorio.nextInt(this.saludos.length)]);
    }
}
