package com.concordia.cejv669.entertext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);

        TextView text1 = findViewById(R.id.textView);
        TextView text2 = findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i, 1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i, 2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == 1) {
            TextView tv1 = findViewById(R.id.textView);
            String myString = data.getStringExtra("returnText");
            tv1.setText(myString);

            if (data.hasExtra("returnText")) {
                Toast.makeText(this, data.getExtras().getString("returnText"),
                        Toast.LENGTH_SHORT).show();
            }}

        if (resultCode == RESULT_OK && requestCode == 2) {
            TextView tv2 = findViewById(R.id.textView2);
            String myString = data.getStringExtra("returnText");
            tv2.setText(myString);

            if (data.hasExtra("returnText")) {
                Toast.makeText(this, data.getExtras().getString("returnText"),
                        Toast.LENGTH_SHORT).show();
            }}
    }
}
