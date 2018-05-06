package com.example.msiraider.newproject.Register;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.net.Uri;

import com.example.msiraider.newproject.R;

public class RegisterActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regis_home);

        ImageButton call = (ImageButton) findViewById(R.id.call);
        ImageButton email = (ImageButton) findViewById(R.id.email);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callPhone();
            }
        });
    }

    private void callPhone() {
        try
        {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RegisterActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
                    return;
                }
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "0894934231"));
                startActivity(callIntent);

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
