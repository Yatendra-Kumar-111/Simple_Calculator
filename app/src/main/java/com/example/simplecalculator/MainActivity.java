package com.example.simplecalculator;
//  upload on GitHub - 07 Aug 2024
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  {

    EditText edit_num_1, edit_num_2 ;
    TextView textView;
    Button button_Add, button_Sub, button_Mul, button_Div;
    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        button_Add = (Button) findViewById(R.id.btnPlus);
        button_Sub = (Button) findViewById(R.id.btnMinus);
        button_Mul = (Button) findViewById(R.id.btnMul);
        button_Div = (Button) findViewById(R.id.btnDiv);

        edit_num_1 = (EditText) findViewById(R.id.input_num_1);
        edit_num_2 = (EditText) findViewById(R.id.input_num_2);
        textView = (TextView) findViewById(R.id.display_result1);


        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(edit_num_1.getText().toString());
                num2 = Integer.parseInt(edit_num_2.getText().toString());
                double result = num1 + num2;
                textView.setText(String.valueOf(result));
            }
        });


        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(edit_num_1.getText().toString());
                num2 = Integer.parseInt(edit_num_2.getText().toString());
                double result = num1 - num2;
                textView.setText(String.valueOf(result));
            }
        });


        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(edit_num_1.getText().toString());
                num2 = Integer.parseInt(edit_num_2.getText().toString());
                double result = num1 * num2;
                textView.setText(String.valueOf(result));
            }
        });


        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(edit_num_1.getText().toString());
                num2 = Integer.parseInt(edit_num_2.getText().toString());
                String check1 = edit_num_1.getText().toString();
                String check2 = edit_num_2.getText().toString();

                if(num2 != 0.0 ){
                    double result = num1 / num2;
                    textView.setText(String.valueOf(result));
                } else if (num1 != 0.0 && num2 == 0.0) {
                    textView.setText(String.valueOf("Infinity"));
                }
                else {
                    textView.setText(String.valueOf("'0' can't divide by '0'"));
                }

            }
        });




   }

}
