package com.example.asteroides;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Puntuaciones extends ListActivity {
   @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        setListAdapter(new MiAdaptador(this, MainActivity.almacen.listaPuntuaciones(10)));
    }

    //Para detectar pulsaciones sobre un elemento de la lista
    @Override protected void onListItemClick(ListView listView, View view, int i, long id) {
        super.onListItemClick(listView, view, i, id);
        Object o = getListAdapter().getItem(i);
        Toast.makeText(this, "Selección: " + Integer.toString(i)
                +  " - " + o.toString(),Toast.LENGTH_LONG).show();
    }
}