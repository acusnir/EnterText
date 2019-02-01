package com.concordia.cejv669.entertext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText msg = findViewById(R.id.editText);
                String textToReturn = msg.getText().toString();

                Intent data = new Intent();
                data.putExtra("returnText", textToReturn);


                setResult(RESULT_OK, data);
                Main2Activity.this.finish();
            }
        });
    }
}
