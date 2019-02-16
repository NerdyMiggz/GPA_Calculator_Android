package com.gpacalc.gpa_rosam4_calculator;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double grade1, grade2, grade3, grade4, grade5, GPA;
    String editText2, editText3, editText4, editText5, editText6;
    //private Button ComputeGPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Lines 32-37 connect to TextView on app
        final EditText Box1 = findViewById(R.id.editText2);
        final EditText Box2 = findViewById(R.id.editText3);
        final EditText Box3 = findViewById(R.id.editText4);
        final EditText Box4 = findViewById(R.id.editText5);
        final EditText Box5 = findViewById(R.id.editText6);
        final TextView finalGPA = findViewById(R.id.textView2);

        final Button ComputeGPA = findViewById(R.id.ComputeGPA);
        final View view = this.getWindow().getDecorView();

        ComputeGPA.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                    //editText# receives grade number
                    editText2 = Box1.getText().toString();
                    //if statement checks if TextView is filled or empty
                    if (editText2 == null || editText2.trim().equals("")) {
                        Context context = getApplicationContext();
                        CharSequence text = "Please enter numerical value.";
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, text, duration).show();
                        //Box1.setBackgroundResource(R.color.red);
                        //toast.show();
                        return;
                    }
                    //Converts string into a double
                    grade1 = Double.parseDouble(editText2);

                    editText3 = Box2.getText().toString();
                    if (editText3 == null || editText3.trim().equals("")) {
                        Context context = getApplicationContext();
                        CharSequence text = "Please enter numerical value.";
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, text, duration).show();
                        return;
                    }
                    grade2 = Double.parseDouble(editText3);

                    editText4 = Box3.getText().toString();
                    if (editText4 == null || editText4.trim().equals("")) {
                        Context context = getApplicationContext();
                        CharSequence text = "Please enter numerical value.";
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, text, duration).show();
                        return;
                    }
                    grade3 = Double.parseDouble(editText4);

                    editText5 = Box4.getText().toString();
                    if (editText5 == null || editText5.trim().equals("")) {
                        Context context = getApplicationContext();
                        CharSequence text = "Please enter numerical value.";
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, text, duration).show();
                        return;
                    }
                    grade4 = Double.parseDouble(editText5);

                    editText6 = Box5.getText().toString();
                    if (editText6 == null || editText6.trim().equals("")) {
                        Context context = getApplicationContext();
                        CharSequence text = "Please enter numerical value.";
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, text, duration).show();
                        return;
                    }
                    grade5 = Double.parseDouble(editText6);

                    GPA = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
                    if (GPA <= 60){
                        view.setBackgroundResource(R.color.red);
                    } else if (GPA >= 61 && GPA <=79) {
                        view.setBackgroundResource(R.color.yellow);
                    } else if (GPA >= 80 && GPA <= 100){
                        view.setBackgroundResource(R.color.green);
                    }
                    //Converts result back into a String and sends result to TextView
                    //to be displayed
                    String GPAstring = Double.toString(GPA);
                    finalGPA.setText(GPAstring);
                    ComputeGPA.setText("Clear Fields");
            }
        });
    }

}
