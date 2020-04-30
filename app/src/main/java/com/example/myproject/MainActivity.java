package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private EditText Name,Email,Password,C_Password;
    private Button btn_SignUp;
    private ProgressBar loading;
    private static String URL_Sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MainActivity);
        loading = findViewById(R.id.loading);
        Name = findViewById(R.id.Name);
        Email= findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        C_Password = findViewById(R.id.C_Password);

        btn_SignUp.setOnClickListener(new View.onClickListner() {

            public void onClick(View v) {

            }

        });
    }
    private void SignUp() {
        loading.setVisibility(View.VISIBLE);
        btn_SignUp.setVisibility(View.GONE);

        final String Name = this.Name.getText().toString().trim();
        final String Email = this.Email.getText().toString().trim();
        final String Password = this.Password.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(DownloadManager.Request.Method.POST,URL_Sign,
                new Response.Listner<String>() {
                    public void onResponse(String response) {

                    }
                },
                new Response.ErrorListner() {
                    public void onErrorResponse(VolleyError error) {

                    }
                })
        {
            protected Map<String,String> getParsms() throws AuthFailureError {
                return super.getParams();
            }
        };
    }
}
