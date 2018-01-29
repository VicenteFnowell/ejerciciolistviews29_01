package com.example.ejerciciolistviews29_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //DECLARANDO ELEMENTOS
    ListView lvnombres;
    TextView textouno,textodos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//IDENTIFICAR ELEMENTOS
        textouno = (TextView)findViewById(R.id.botoncorto);
        textodos = (TextView)findViewById(R.id.botonlargo);
        lvnombres = (ListView)findViewById(R.id.listanombres);

        //DATOS LISTVIEW
        String[] nombres = {"Juan", "Rigoberto", "Emmanuel", "Tobias", "DeAndre", "Michael", "Magnuss", "Miguelín","Abelardo"};
        //CREAR ADAPTADOR
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nombres);
        //AÑADIRA ADAPTADOR A LIST
        lvnombres.setAdapter(adaptador);

//Añadir pulsación corta

        lvnombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nombre_seleccionado = parent.getItemAtPosition(position).toString();
                textouno.setText(nombre_seleccionado);
            }
        });

//Añadir pulsación larga

        lvnombres.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });

        lvnombres.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String nombre_seleccionado = parent.getItemAtPosition(position).toString();
                textodos.setText(nombre_seleccionado);

                return true;
            }
        });

        {


    };











    }//FIN ONCREATE




}//FIN ACTIVITY
