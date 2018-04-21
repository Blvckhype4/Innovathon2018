package com.example.mati.innovathon2018;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.ExtractEditText;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.DrawableUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import com.example.mati.innovathon2018.models.*;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterForm extends AppCompatActivity {

    private DatabaseReference databaseReference;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private EditText mDisplayName, mEmail;
    private AppCompatSpinner mUniversity, mDepartment;
    private Object AdapterView;
    private FloatingActionButton fab;
    private AppCompatCheckBox mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);

        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        mDisplayName = (EditText) findViewById(R.id.displayNameEdit);
        mEmail = (EditText) findViewById(R.id.emailEdit);
        mUniversity = (AppCompatSpinner) findViewById(R.id.universitySpinner);
        mDepartment = (AppCompatSpinner) findViewById(R.id.departamentSpinner);
        mCheckBox = (AppCompatCheckBox) findViewById(R.id.check);
        fab = (FloatingActionButton) findViewById(R.id.fabBtn);

        mDisplayName.setText(mUser.getDisplayName().toString());
        mDisplayName.setKeyListener(null);
        mEmail.setText(mUser.getEmail().toString());
        mEmail.setKeyListener(null);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.spinnerValues, android.R.layout.simple_spinner_item);
        mUniversity.setAdapter(adapter1);
        mUniversity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (mUniversity.getSelectedItem().equals("UAM")) {

                    ArrayAdapter adapter2 = ArrayAdapter.createFromResource(getApplicationContext(),
                            R.array.UAM, android.R.layout.simple_spinner_item);
                    mDepartment.setAdapter(adapter2);
                } else if (mUniversity.getSelectedItem().equals("AWF")) {
                    ArrayAdapter adapter2 = ArrayAdapter.createFromResource(getApplicationContext(),
                            R.array.AWF, android.R.layout.simple_spinner_item);
                    mDepartment.setAdapter(adapter2);
                }
                else if (mUniversity.getSelectedItem().equals("UMP")) {
                    ArrayAdapter adapter2 = ArrayAdapter.createFromResource(getApplicationContext(),
                            R.array.UMP, android.R.layout.simple_spinner_item);
                    mDepartment.setAdapter(adapter2);
                }
                else if (mUniversity.getSelectedItem().equals("UPP")) {
                    ArrayAdapter adapter2 = ArrayAdapter.createFromResource(getApplicationContext(),
                            R.array.UPP, android.R.layout.simple_spinner_item);
                    mDepartment.setAdapter(adapter2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference = FirebaseDatabase.getInstance().getReference("Uid");
                User user = new User(mUser.getUid(), mDisplayName.getText().toString(), mEmail.getText().toString(), mUniversity.getSelectedItem().toString(), mDepartment.getSelectedItem().toString(), mCheckBox.isChecked());
                databaseReference.push().setValue(user);
                startActivity(new Intent(RegisterForm.this, MainActivity.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
