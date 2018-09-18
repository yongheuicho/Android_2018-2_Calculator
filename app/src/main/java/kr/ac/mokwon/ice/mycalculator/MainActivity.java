package kr.ac.mokwon.ice.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected double ans = 0.;  // Answer
    protected Button btEqual;

    protected void inputNum() {

    }

    protected double op4(String sOp, double x) {
        return 0.;
    }

    protected double mathOp(String sFun, double x) {
        return 0.;
    }

    protected void printNum(double x) {

    }

    protected void calculate() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btEqual = (Button) findViewById(R.id.btEqual);
        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }
}
