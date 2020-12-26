package com.example.ktlan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<datadl> arrayList= new ArrayList<>();
        arrayList.add(new datadl(R.drawable.hinh1,"Bình minh ở biển","Đà Nẵng"));
        arrayList.add(new datadl(R.drawable.hinh2,"Bình minh trên cao","Đà Nẵng"));
        arrayList.add(new datadl(R.drawable.hinh3,"Đà nẵng về đêm","Đà Nẵng"));
        arrayList.add(new datadl(R.drawable.hinh4,"Bãi đá Nam Ô","Đà Nẵng"));
        arrayList.add(new datadl(R.drawable.hinh5,"BaNa Hill","Đà Nẵng"));
        dladapter dladapter =new dladapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(dladapter);
    }
}