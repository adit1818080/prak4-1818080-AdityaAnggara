package com.example.a1818080recycleview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclearview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter( this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setTitle("Adit");
        m.setDescription("NIM : 1818080");
        m.setDescription2("Angkatan : 2011");
        models.add(m);
        m = new Model();
        m.setTitle("Tya");
        m.setDescription("NIM : 1818081");
        m.setDescription2("Angkatan : 2019");
        models.add(m);
        m = new Model();
        m.setTitle("Anggara");
        m.setDescription("NIM : 1818082");
        m.setDescription2("Angkatan : 2018");
        models.add(m);
        m = new Model();
        m.setTitle("Gatra");
        m.setDescription("NIM : 1818083");
        m.setDescription2("Angkatan : 2010");
        models.add(m);
        m = new Model();
        m.setTitle("Datra");
        m.setDescription("NIM : 1818084");
        m.setDescription2("Angkatan : 2016");
        models.add(m);
        return models;
    }
}
