package com.example.login_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button mLoginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginbutton=(Button) findViewById(R.id.loginbutton);
        mLoginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 gotoRecyclerview();
            }


        });
    }
    private void gotoRecyclerview()
    {
        Intent intent=new Intent(this, ListActivity.class);
    }

}
