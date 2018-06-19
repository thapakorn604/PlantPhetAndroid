package com.example.msiraider.newproject.Register;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.msiraider.newproject.HomeActivity;
import com.example.msiraider.newproject.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;

import java.util.HashMap;
import java.util.Map;


public class RegisFatmer extends AppCompatActivity {

    private EditText firstname, lastname, inputPhone, email, password, inputAddress, inputDistrict, inputZipcode, inputProvince, farmer_product, farmer_area, farmer_harvest;
    private Button btn_register;
    private ProgressBar progressBar;
    private FirebaseAuth auth;
    private FirebaseUser firebaseUser;
    private DatabaseReference databaseReference;
    private FirebaseDatabase database;
    public String inputemail, inputpassword, inputfirstname, inputlastname, address, district, zipcode, province, phone, product, area, harvest;
    Farmer farmer;
    final FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser() ;

    private void getValues() {
        farmer.setInputemail(email.getText().toString().trim());
        farmer.setInputpassword(password.getText().toString().trim());
        farmer.setInputfirstname(firstname.getText().toString().trim());
        farmer.setInputlastname(lastname.getText().toString().trim());
        farmer.setAddress(inputAddress.getText().toString().trim());
        farmer.setDistrict(inputDistrict.getText().toString().trim());
        farmer.setZipcode(inputZipcode.getText().toString().trim());
        farmer.setProvince(inputProvince.getText().toString().trim());
        farmer.setPhone(inputPhone.getText().toString().trim());
        farmer.setProduct(farmer_product.getText().toString().trim());
        farmer.setArea(farmer_area.getText().toString().trim());
        farmer.setHarvest(farmer_harvest.getText().toString().trim());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regis_farmer_regis);

        auth = FirebaseAuth.getInstance();

        btn_register = (Button) findViewById(R.id.btn_register);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        inputAddress = (EditText) findViewById(R.id.inputAddress);
        inputDistrict = (EditText) findViewById(R.id.inputDistrict);
        inputZipcode = (EditText) findViewById(R.id.inputZipcode);
        inputProvince = (EditText) findViewById(R.id.inputProvince);
        inputPhone = (EditText) findViewById(R.id.inputPhone);
        farmer_product = (EditText) findViewById(R.id.farmer_product);
        farmer_area = (EditText) findViewById(R.id.farmer_area);
        farmer_harvest = (EditText) findViewById(R.id.farmer_harvest);
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("farmer");
        farmer = new Farmer();

        btn_register.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                inputemail = email.getText().toString().trim();
                inputpassword = password.getText().toString().trim();
                inputfirstname = firstname.getText().toString().trim();
                inputlastname = lastname.getText().toString().trim();
                address = inputAddress.getText().toString().trim();
                district = inputDistrict.getText().toString().trim();
                zipcode = inputZipcode.getText().toString().trim();
                province = inputProvince.getText().toString().trim();
                phone = inputPhone.getText().toString().trim();
                product = farmer_product.getText().toString().trim();
                area = farmer_area.getText().toString().trim();
                harvest = farmer_harvest.getText().toString().trim();
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


                if (TextUtils.isEmpty(inputemail)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุอีเมล", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(inputpassword)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุข้อมูล", Toast.LENGTH_SHORT).show();
                }

                if (inputpassword.length() < 6) {
                    Toast.makeText(getApplicationContext(), "รหัสของคุณสั้นเกินไป", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(inputfirstname)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุชื่อต้นของคุณ", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(inputlastname)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุนามสกุลของคุณ", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(address)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุข้อมูล", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(district)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุข้อมูล", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(zipcode)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุข้อมูล", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(province)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุข้อมูล", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุเบอร์โทรศัพท์", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(product)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุข้อมูล", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(area)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุข้อมูล", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(harvest)) {
                    Toast.makeText(getApplicationContext(), "กรุณาระบุข้อมูล", Toast.LENGTH_SHORT).show();
                }

                progressBar.setVisibility(View.VISIBLE);

                auth.createUserWithEmailAndPassword(inputemail, inputpassword).addOnCompleteListener(RegisFatmer.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);

                        if (!task.isSuccessful()) {
                            Toast.makeText(RegisFatmer.this, "การลงทะเบียนไม่สำเร็จ" + task.getException(), Toast.LENGTH_SHORT).show();

                        } else
                            Toast.makeText(RegisFatmer.this, "สำเร็จ! ขอบคุณที่เข้าร่วมกับเรา", Toast.LENGTH_SHORT).show();
                            databaseReference.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                getValues();
                                databaseReference.child(auth.getUid()).setValue(farmer);
                                Toast.makeText(RegisFatmer.this,"Work",Toast.LENGTH_LONG);
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError databaseError) {

                            }
                        });
                        startActivity(new Intent(RegisFatmer.this, HomeActivity.class));
                        finish();
                    }

                });



            }

        });


    }



    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }
}
