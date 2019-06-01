package br.com.digitalhousehouse.listacontato.View;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhousehouse.listacontato.R;
import br.com.digitalhousehouse.listacontato.View.Adapter.ContatoAdapter;
import br.com.digitalhousehouse.listacontato.View.Model.Contatos;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewContatos;
    ContatoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewContatos = findViewById(R.id.ListaContatosRecyclerView);

        adapter = new ContatoAdapter(listaDeContatos());

        recyclerViewContatos.setAdapter(adapter);
        recyclerViewContatos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    }

    private List<Contatos> listaDeContatos() {
        List<Contatos> contatos = new ArrayList<>();

        contatos.add(new Contatos("Jessica"));
        contatos.add(new Contatos("Tairo"));
        contatos.add(new Contatos("Eduardo"));
        contatos.add(new Contatos("Mayara"));
        contatos.add(new Contatos("Sergio"));
        contatos.add(new Contatos("Ivan"));
        contatos.add(new Contatos("Victor"));
        contatos.add(new Contatos("Kely"));

        return contatos;
    }
}