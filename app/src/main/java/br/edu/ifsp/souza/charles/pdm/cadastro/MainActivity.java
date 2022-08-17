package br.edu.ifsp.souza.charles.pdm.cadastro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import br.edu.ifsp.souza.charles.pdm.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());
        Spinner spinnerUf = findViewById(amb.ufSpn.getId());
        spinnerUf.setAdapter(new ArrayAdapter<UnidadeFederacao>(this, android.R.layout.simple_spinner_item, UnidadeFederacao.values()));
        amb.salvarBtn.setOnClickListener( view -> {
                    Formulario formulario = preencheFormulario();
                    Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show();
        });
        amb.limparBtn.setOnClickListener(view -> limpaFormulario()
        );
    }

    private void limpaFormulario() {
        amb.nomeEt.getText().clear();
        amb.telefoneEt.getText().clear();
        amb.emailEt.getText().clear();
        amb.mailingCb.setChecked(false);
        amb.sexoRg.clearCheck();
        amb.cidadeEt.getText().clear();
        amb.ufSpn.setSelection(0);
    }

    //@RequiresApi(api = Build.VERSION_CODES.R)
    @NonNull
    private Formulario preencheFormulario() {
        String nome = amb.nomeEt.getText().toString();
        String telefone = amb.telefoneEt.getText().toString();
        String email = amb.emailEt.getText().toString();
        Boolean mailing = amb.mailingCb.isChecked();
        String sexo = amb.masculinoRb.isChecked() ? "Masculino" : "Feminino";
        String cidade = amb.cidadeEt.getText().toString();
        String uf = amb.ufSpn.getSelectedItem().toString();
        return new Formulario(nome, telefone, email, mailing, sexo, cidade, uf);
    }
}