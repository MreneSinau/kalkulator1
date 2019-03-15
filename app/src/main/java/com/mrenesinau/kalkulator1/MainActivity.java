package com.mrenesinau.kalkulator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnTambah,btnkurang,tbnKali,btnBagi,btnHapus;
    private TextView txthasil;
    private EditText txtAngkaPertama,txtAngkaKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        btnTambah=(Button)findViewById(R.id.btnTambah);
        btnkurang=(Button)findViewById(R.id.btnkurang);
        tbnKali=(Button)findViewById(R.id.tbnKali);
        btnBagi=(Button)findViewById(R.id.btnBagi);
        btnHapus=(Button)findViewById(R.id.btnHapus);
        txtAngkaPertama=(EditText)findViewById(R.id.txtAngkaPertama);
        txtAngkaKedua=(EditText)findViewById(R.id.txtAngkaKedua);
        txthasil=(TextView)findViewById(R.id.txthasil);

        btnTambah.setOnClickListener(this);
        btnkurang.setOnClickListener(this);
        tbnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnHapus.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String Bil1=txtAngkaPertama.getText().toString();
        String Bil2=txtAngkaKedua.getText().toString();

        switch (v.getId()){
            case R.id.btnTambah:
                double Tambahkan=Double.parseDouble(Bil1) + Double.parseDouble(Bil2);
                txthasil.setText(String.valueOf(Tambahkan));
                break;

            case R.id.btnkurang:
                double Kurangkan=Double.parseDouble(Bil1) - Double.parseDouble(Bil2);
                txthasil.setText(String.valueOf(Kurangkan));
                break;

            case R.id.tbnKali:
                try{
                    double Kalikan=Double.parseDouble(Bil1) * Double.parseDouble(Bil2);
                    txthasil.setText(String.valueOf(Kalikan));
                }catch (Exception e){
                    txthasil.setText("Tidak Sampai");
                }
                break;

            case R.id.btnBagi:
                double Bagikan=Double.parseDouble(Bil1) / Double.parseDouble(Bil2);
                txthasil.setText(String.valueOf(Bagikan));
                break;
            }





    }
}
