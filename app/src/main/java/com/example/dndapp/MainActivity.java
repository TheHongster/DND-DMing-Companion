package com.example.dndapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Fragment1.Ilisner{

    public ArrayList<Block> list = new ArrayList<>();
    public int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.b, new Fragment1())
                .commitNow();
    }

    @Override
    public void add(Block block) {
        list.add(block);
    }

    @Override
    public Block get(int i) {
        return list.get(i);
    }

    @Override
    public ArrayList grab() {
        return list;
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public void setId(int i) {
    id=i;
    }



}