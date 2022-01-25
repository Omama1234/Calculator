package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.*;
import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button b1;
    TextView editText3;
    String s1, s2;

    public int Multilply(int x, int y) {
        return x * y;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.txtEdit1);
        editText2 = (EditText) findViewById(R.id.txtEdit2);
        editText3 = (TextView) findViewById(R.id.txtEdit3);
        b1 = (Button) findViewById(R.id.mul);



//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch(view.getId())
//                {
//                    case  R.id.mul:
//                        int num1=0;
//                        int num2=0;
//                        if(s1.length()==0 && s2.length()==0)
//                        {
//                            num1=0;
//                            num2=0;
//                        }
//                        else if(s1.length()==0)
//                        {
//                            num1=0;
//                        }
//                        else if(s2.length()==0)
//                        {
//                            num2=0;
//                        }
//                        else
//                        {
//                            num1=Integer.parseInt(s1);
//                            num2=Integer.parseInt(s2);
//                        }
//
//                        System.out.println(num1+" "+num2);
//                        int result=num1*num2;
//                        String str2=Integer.toString(result);
//                        System.out.println(str2);
//                        editText3.setText(str2);
//                        break;
//                    default:
//                        break;
//                }
//
//            }
//        });
//    }


    }

    public void btnmul(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int n=n1*n2;
      editText3.setText("Result ->"+String.valueOf(n));

    }

    public void btnclr(View view) {
        editText1.setText("");
        editText2.setText("");
        editText3.setText("");
    }

    public void btndiv(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        double n=(double)n1/n2;
        editText3.setText("Result ->"+Double.valueOf(n));
    }

    public void btnsub(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int n=n1-n2;
        editText3.setText("Result ->"+Integer.valueOf(n));
    }

    public void btnmod(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int n=n1%n2;
        editText3.setText("Result ->"+String.valueOf(n));
    }

    public void btnsum(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int n=n1+n2;
        editText3.setText("Result ->"+String.valueOf(n));
    }

    public void btneight(View view) {
        String str=editText1.getText().toString();
        if(str.length()==0)
        {
            str="8";
            int n=Integer.parseInt(str);
            editText1.setText(String.valueOf(n));
        }else{
            str=str+8;
            int n=Integer.parseInt(str);
            editText1.setText(String.valueOf(n));
        }


    }
}