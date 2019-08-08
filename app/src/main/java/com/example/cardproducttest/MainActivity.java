package com.example.cardproducttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> isBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isBook = new ArrayList<>();
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));
        isBook.add(new Book("Judul A", "Tittle", "Description", R.drawable.kata));
        isBook.add(new Book("Judul B", "Tittle", "Description", R.drawable.negri_lima_menara));
        isBook.add(new Book("Judul C", "Tittle", "Description", R.drawable.perahu_kertas));
        isBook.add(new Book("Judul D", "Tittle", "Description", R.drawable.rentang_kisah));
        isBook.add(new Book("Judul E", "Tittle", "Description", R.drawable.sebelas_patriot));
        isBook.add(new Book("Judul F", "Tittle", "Description", R.drawable.surat_kecil_untuk_tuhan));

        RecyclerView myrv =  (RecyclerView) findViewById(R.id.recycle_view);
        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this, isBook);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
