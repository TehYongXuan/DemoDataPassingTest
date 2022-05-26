package sg.edu.rp.c346.id21010860.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    //step 1
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        //step2
        tvAnswer2 = findViewById(R.id.textView4);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("double1",  99.99);
        tvAnswer2.setText("Double value received is: "+ value);
    }
}