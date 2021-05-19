package sg.edu.rp.c346.id20008787.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView textView;
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        textView = findViewById(R.id.textView);
        btnBack = findViewById(R.id.btnBack);


        Intent intentReceived = getIntent();
        String Code = intentReceived.getStringExtra("ModuleCode");
        String Name = intentReceived.getStringExtra("ModuleName");
        int Year = intentReceived.getIntExtra("AcademicYear", 0);
        int Semester = intentReceived.getIntExtra("Semester", 0);
        int Credit = intentReceived.getIntExtra("ModuleCredit", 0);
        String Venue = intentReceived.getStringExtra("Venue");

        textView.setText("Module Code: " + Code + "\n Module Name: " + Name + "\n Academic Year: " + Year + "\n Semester: " + Semester +
                "\n Module Credit: " + Credit + "\n Venue: " + Venue );

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}