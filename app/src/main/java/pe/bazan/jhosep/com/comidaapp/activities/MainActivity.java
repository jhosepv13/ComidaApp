package pe.bazan.jhosep.com.comidaapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import pe.bazan.jhosep.com.comidaapp.R;
import pe.bazan.jhosep.com.comidaapp.adapters.ComidaAdapter;
import pe.bazan.jhosep.com.comidaapp.repositories.ComidaRepository;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ComidaAdapter comidaAdapter = new ComidaAdapter();
        comidaAdapter.setComida(ComidaRepository.getList());

        recyclerView.setAdapter(comidaAdapter);
    }
}
