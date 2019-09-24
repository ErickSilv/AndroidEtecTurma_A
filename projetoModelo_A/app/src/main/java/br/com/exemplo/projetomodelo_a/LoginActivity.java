package br.com.exemplo.projetomodelo_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnEnviar;
    private Button btnCancelar;
    private EditText edtUsuario;
    private EditText edtSenha;

    String senha;
    String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inicializarObjeto();
        abrirActivityMenu();
    }

    private void inicializarObjeto(){
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
    }

    private void abrirActivityMenu(){
      btnEnviar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              Intent intentActivityMenu = new Intent(getApplicationContext(),MenuActivity2.class);
              startActivity(intentActivityMenu);

          }
      });

      btnCancelar.setOnClickListener(new View.OnClickListener(){
          @Override
          public  void onClick(View view){
              Toast.makeText(getApplicationContext(), "Fechando !!! Aguarde", Toast.LENGTH_LONG).show();

          }

      });
    }
}
