package com.example.student.nguyentanhoang_16010801;

import android.content.DialogInterface;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtma,edtten;
Button btnluu,btnThoat;
CheckBox chkluu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtma=(EditText)findViewById(R.id.edt_TK);
        edtten=(EditText)findViewById(R.id.edt_TenTK);
        btnluu=(Button)findViewById(R.id.btndangnhap);
        chkluu=(CheckBox)findViewById(R.id.ck_luu);
        btnThoat=(Button)findViewById(R.id.btnThoat);
        chkluu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Ban đã chọn",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this,"Ban đã bỏ chọn",Toast.LENGTH_SHORT).show();

                }
            }
        });


        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkluu.isChecked()){
                    Toast.makeText(MainActivity.this,"Ban đã đăng nhập ,thông tin đã lưu",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Ban đã đăng nhập ,thông tin chưa được lưu",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
