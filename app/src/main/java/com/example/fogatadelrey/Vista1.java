package com.example.fogatadelrey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Vista1 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ModeloDatos> modeloDatosList;
    RecyclerViewAdapter recyclerViewAdapter;
    LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista1);
        recyclerView = findViewById(R.id.recyclerview);

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        modeloDatosList = new ArrayList<>();

        modeloDatosList.add(new ModeloDatos(R.drawable.ceviche,"Ceviche de pescado", "Pescado marinado en jugo de limón con cebolla y cilantro","S/. 35", "Descuento de 10%" ));
        modeloDatosList.add(new ModeloDatos(R.drawable.burger,"Hamburguesa", "falta descripcion","S/. 15", "Descuento de 10%" ));
        modeloDatosList.add(new ModeloDatos(R.drawable.lech,"Leche de tigre", "falta descripcion","S/. 15", "Descuento de 10%" ));
        modeloDatosList.add(new ModeloDatos(R.drawable.mixto,"Ceviche mixto", "falta descripcion","S/. 35", "Descuento de 10%" ));
        modeloDatosList.add(new ModeloDatos(R.drawable.sud,"Sudado de pescado", "falta descripcion","S/. 35", "Descuento de 10%" ));
        modeloDatosList.add(new ModeloDatos(R.drawable.trio,"Trio marino", "falta descripcion","S/. 35", "Descuento de 10%" ));
        modeloDatosList.add(new ModeloDatos(R.drawable.ceviche,"AQUI VA OTRO PLATO", "falta descripcion","S/. 35", "Descuento de 10%" ));
        recyclerViewAdapter = new RecyclerViewAdapter(this, modeloDatosList);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.notifyDataSetChanged();



    }
}