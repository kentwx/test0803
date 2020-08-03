package com.example.test0803;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    //1.宣告物件
    TextView txtShow;
    Button b00,b01,b02,b03,b04,b05,b06,b07,b08,b09,b10,b11,bClear,bClearAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.連結元件
        txtShow=(TextView) this.findViewById(R.id.txtShow) ;
        b00=(Button) this.findViewById(R.id.B00);
        b01=(Button) this.findViewById(R.id.B01);
        b02=(Button) this.findViewById(R.id.B02);
        b03=(Button) this.findViewById(R.id.B03);
        b04=(Button) this.findViewById(R.id.B04);
        b05=(Button) this.findViewById(R.id.B05);
        b06=(Button) this.findViewById(R.id.B06);
        b07=(Button) this.findViewById(R.id.B07);
        b08=(Button) this.findViewById(R.id.B08);
        b09=(Button) this.findViewById(R.id.B09);
        b10=(Button) this.findViewById(R.id.B10);
        b11=(Button) this.findViewById(R.id.B11);
        bClear=(Button) this.findViewById(R.id.BClear);
        bClearAll=(Button) this.findViewById(R.id.BClearAll);
        //3.建立事件
        b00.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"0");
            }});
        b01.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"1");
            }});
        b02.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"2");
            }});
        b03.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"3");
            }});
        b04.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"4");
            }});
        b05.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"5");
            }});
        b06.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"6");
            }});
        b07.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"7");
            }});
        b08.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"8");
            }});
        b09.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"9");
            }});
        b10.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"*");
            }});
        b11.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                txtShow.setText(S+"#");
            }});
        bClear.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                if (S.length()>5){
                    txtShow.setText(S.substring(0, S.length()-1));
                }
            }});
        bClearAll.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO 自動產生的方法 Stub
                String S=txtShow.getText().toString();
                if (S.length()>5){
                    txtShow.setText(S.substring(0, S.length()-S.length()+5));
                }
            }});
    }
}