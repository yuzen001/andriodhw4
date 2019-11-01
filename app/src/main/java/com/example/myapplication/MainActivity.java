package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText mileage_in;              
    EditText addition_in;
    EditText amount_in;
    TextView amount_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mileage_in = (EditText)findViewById(R.id.mileage_in);
        addition_in = (EditText)findViewById(R.id.addition_in);
        amount_in = (EditText)findViewById(R.id.amount_in);
        amount_out= (TextView) findViewById(R.id.amount_out);
        Button submit = (Button)findViewById(R.id.output);
        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                int num1 = Integer.parseInt(mileage_in.getText().toString());
                int num2=Integer.parseInt(addition_in.getText().toString());

                if (num1<num2) {
                    amount_out.setText("75元");




                }
                else  if (num1>num2) {
                    float fresult_out = Float.parseFloat(mileage_in.getEditableText().toString());
                    float addition = Float.parseFloat(addition_in.getEditableText().toString());
                    float amount = Float.parseFloat(amount_in.getEditableText().toString());
                    float fresult;
                    TextView result = (TextView)findViewById(R.id.amount_out);
                    fresult_out = ((fresult_out-addition)*amount)+75;
                    NumberFormat nf = NumberFormat.getInstance();
                    nf.setMaximumFractionDigits(2);
                    fresult = fresult_out;
                    result.setText(nf.format(fresult_out) +"元");



                }

            }
        });
    }
}