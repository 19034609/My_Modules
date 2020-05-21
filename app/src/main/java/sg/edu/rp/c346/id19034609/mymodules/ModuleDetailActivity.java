package sg.edu.rp.c346.id19034609.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.textView);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String displayMessage = "";
        displayMessage += "Module Code: " + intentReceived.getStringExtra("moduleCode") + "\n";
        displayMessage += "Module Name: " + intentReceived.getStringExtra("moduleName") + "\n";
        displayMessage += "Academic Year: " + intentReceived.getIntExtra("academicYear", 0) + "\n";
        displayMessage += "Semester: " + intentReceived.getIntExtra("semester", 0) + "\n";
        displayMessage += "Module Credit: " + intentReceived.getIntExtra("moduleCredit", 0) + "\n";
        displayMessage += "Value: " + intentReceived.getStringExtra("venue");

        tvAnswer.setText(displayMessage);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
