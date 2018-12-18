package com.example.rucha.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.rucha.myapplication.R.id.list_item;
import static com.example.rucha.myapplication.R.id.spinner1;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
public class busroute extends Activity implements OnItemSelectedListener {
Spinner spinner1,spinner2;

    private DatabaseReference mDatabase;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("https://myapplication2-1c792.firebaseio.com/myapplication2-1c792/Route/");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busroute);
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner2= (Spinner)findViewById(R.id.spinner2);
        Button button=(Button)findViewById(R.id.button);


        // Spinner click listener
        spinner1.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String>categories=new ArrayList<String>();

        categories.add("Rahatani Phata");
        categories.add("Sangavi");
        categories.add("Shivaji Nagar");
        categories.add("Pune Mumbai Highway");
        categories.add("Bhosari");
        categories.add("Katraj");
        categories.add("Shahu Nagar");
        categories.add("Kothrud");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter);




        spinner1.setOnItemSelectedListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(busroute.this,RouteTT.class);
                intent.putExtra("data",String.valueOf(spinner1.getSelectedItem()));
                intent.putExtra("stops",String.valueOf(spinner2.getSelectedItem()));
                startActivity(intent);
            }
        });
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        //String item = parent.getItemAtPosition(position).toString();
        String sp1= String.valueOf(spinner1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if(sp1.contentEquals("Rahatani Phata")) {
            List<String> list = new ArrayList<String>();
            list.add("Rahatani");
            list.add("Morya Hosiptal");
            list.add("Others");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter2);
        }

        if(sp1.contentEquals("Sangavi")) {
            List<String> list = new ArrayList<String>();
            list.add("old Sangavi");
            list.add("new sangavi");
            list.add("Rahatani");
            list.add("sai Mandir");
            ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter3.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter3);
        }
        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " +spinner2.getSelectedItem() , Toast.LENGTH_LONG).show();


    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}

