package sg.edu.rp.c346.id19034609.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346, tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("moduleCode","C346");
                i.putExtra("moduleName", "Android Programming");
                i.putExtra("academicYear", 2020);
                i.putExtra("semester", 1);
                i.putExtra("moduleCredit", 4);
                i.putExtra("venue", "W66M");
                startActivity(i);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("moduleCode","C349");
                i.putExtra("moduleName", "iPad Programming");
                i.putExtra("academicYear", 2020);
                i.putExtra("semester", 1);
                i.putExtra("moduleCredit", 4);
                i.putExtra("venue", "W67J");
                startActivity(i);
            }
        });
    }
}
