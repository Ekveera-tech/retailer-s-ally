package com.example.loginregisterjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class recommendation extends AppCompatActivity {

    private String url = "http://" + "192.168.1.6" + ":" + 5000 + "/";
    private String postBodyString;
    private MediaType mediaType;
    private RequestBody requestBody;
    private Button recommend;
    private TextView rules;
    private TextInputEditText product;
    private Button btn_clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);
        recommend = findViewById(R.id.recommend);
        btn_clear=findViewById(R.id.clear);
        rules= findViewById(R.id.rules);
        product=findViewById(R.id.product);
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postRequest(url+"recommendation");

            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.setText(" ");
                rules.setText(" ");

            }
        });
    }


    private void postRequest(String URL) {
        product=findViewById(R.id.product);
        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody formbody = new FormBody
                .Builder()
                .add("product", String.valueOf(product.getText()))
                .build();
        Request request=new Request.Builder().url(URL).post(formbody).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(final Call call, final IOException e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        Toast.makeText(recommendation.this, "Something went wrong:" + " " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        call.cancel();


                    }
                });

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            rules.setText("Your recommendations are:\n\n");
                            rules.setText(response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });


            }


        });
    }
}