package com.ctos.contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        registerForContextMenu(btn);

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);

        menu.setHeaderTitle("SMS options");
        menu.add(0,v.getId(),0,"Forward");
        menu.add(0,v.getId(),0,"Delete");
        menu.add(0,v.getId(),0,"Lock");
        menu.add(0,v.getId(),0,"View details");
        menu.add(0,v.getId(),0,"Select Text");
        menu.add(0,v.getId(),0,"Save message to SIM Card");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){

        if (item.getTitle()=="Copy"){
            Toast.makeText(getApplicationContext(),"Copy Code",Toast.LENGTH_LONG).show();
        } else if (item.getTitle()=="Forward") {
            Toast.makeText(getApplicationContext(),"Forward Code",Toast.LENGTH_LONG).show();
        } else if (item.getTitle()=="Delete") {
            Toast.makeText(getApplicationContext(),"Delete",Toast.LENGTH_LONG).show();
        } else if (item.getTitle()=="Lock") {
            Toast.makeText(getApplicationContext(),"Select Lock",Toast.LENGTH_LONG).show();
        } else if (item.getTitle()=="View details") {
            Toast.makeText(getApplicationContext(),"View Detailed Code",Toast.LENGTH_LONG).show();
        }else if (item.getTitle()=="Select Text") {
            Toast.makeText(getApplicationContext(),"Select Code",Toast.LENGTH_LONG).show();
        }else if (item.getTitle()=="Save message to SIM Card") {
            Toast.makeText(getApplicationContext(),"Save To Sim Card",Toast.LENGTH_LONG).show();
        } else {
            return false;
        }
        return true;
    }
}