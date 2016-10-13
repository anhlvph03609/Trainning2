package com.example.administrator.trainning2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    int [] img = {R.drawable.apple,R.drawable.a};
    EditText edtName,edtCountry;
    ListView lv;
    ArrayList<User> arrUser;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        edtName = (EditText) findViewById(R.id.edtName);
        edtCountry = (EditText) findViewById(R.id.edtCountry);
        lv = (ListView) findViewById(R.id.lv);
        arrUser = new ArrayList<User>();

       final CustomListview lvAdapter = new   CustomListview(getApplicationContext(),arrUser);
        lv.setAdapter(lvAdapter);
       // name = new ArrayList<String>();
        arrUser = new ArrayList<User>();
        CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(getApplicationContext(),img);
        spinner.setAdapter(adapter);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtCountry.getText().toString().trim().equals("") || edtName.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please fill all the fields",Toast.LENGTH_LONG).show();
                }
                else{
                    String name = edtName.getText().toString().trim();
                    String country = edtCountry.getText().toString().trim();
                    int i = spinner.getSelectedItemPosition();
                    User user = new User(img[i],name,country);
                    arrUser.add(user);
                    lvAdapter.refresh(arrUser);

                }
            }
        });

    }
}
