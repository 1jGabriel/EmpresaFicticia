package empresaficticia.android.projetos.com.empresaficticia;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton navigateToEmpresaActivityButton;
    private ImageButton navigateToServicosActivityButton;
    private ImageButton navigateToClientesActivityButton;
    private ImageButton navigateToContatoActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateToServicosActivityButton = (ImageButton) findViewById(R.id.servicosButtonId);
        navigateToEmpresaActivityButton = (ImageButton) findViewById(R.id.aEmpresaButtonId);
        navigateToClientesActivityButton = (ImageButton) findViewById(R.id.clientesButtonId);
        navigateToContatoActivityButton = (ImageButton) findViewById(R.id.contatoButtonId);

        navigateToEmpresaActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        navigateToContatoActivityButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });
        navigateToClientesActivityButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        navigateToServicosActivityButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
            }
        });

    }
}
