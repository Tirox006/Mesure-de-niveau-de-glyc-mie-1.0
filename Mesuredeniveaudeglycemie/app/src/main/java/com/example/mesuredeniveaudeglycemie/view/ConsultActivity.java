package com.example.mesuredeniveaudeglycemie.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mesuredeniveaudeglycemie.R;

public class ConsultActivity extends AppCompatActivity {
    private final String RESPONSE_KEY="result";
    private TextView tvReponse;
    private Button btnRetour;
    private String reponse;

    private void init(){
        tvReponse=findViewById(R.id.tvReponse);
        btnRetour=findViewById(R.id.btnRetour);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        init();

        Intent intent = getIntent();
        reponse=intent.getStringExtra(RESPONSE_KEY);
        tvReponse.setText(reponse);

        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                if(reponse==null){
                    setResult(RESULT_CANCELED,intent);
                }
                else{
                    setResult(RESULT_OK,intent);}
                finish();
            }
            });
        }
}