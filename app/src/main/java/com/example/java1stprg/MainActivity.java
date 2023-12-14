package com.example.java1stprg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Activity {

    private LinearLayout mainContainer;
    private ImageView imgcat;
    private TextView txtWelcomeMessage;
    private EditText edtMessage;
    private Button btnSetMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainContainer = new LinearLayout(this);
        mainContainer.setOrientation(LinearLayout.VERTICAL);
        mainContainer.setPadding(100, 100, 100, 100);

        ViewGroup.LayoutParams layoutParams1 = new ViewGroup.LayoutParams(300, 800);

       /* imgcat = new ImageView(this);
        imgcat.setImageResource(R.drawable.cat);
        imgcat.setLayoutParams(layoutParams1);
        mainContainer.addView(imgcat);*/


      /*  ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        txtWelcomeMessage = new TextView(this);
        txtWelcomeMessage.setText("Welcome to BitCode!");
        txtWelcomeMessage.setTextSize(30);
        txtWelcomeMessage.setLayoutParams(layoutParams2);
        mainContainer.addView(txtWelcomeMessage);

        edtMessage = new EditText(this);
        edtMessage.setHint("Enter new message");
        edtMessage.setLayoutParams(layoutParams2);
        mainContainer.addView(edtMessage);

        btnSetMessage = new Button(this);
        btnSetMessage.setText("Set Message");
        mainContainer.addView(btnSetMessage);

        btnSetMessage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtWelcomeMessage.setText(edtMessage.getText().toString());
                    }
                }
        );

        txtWelcomeMessage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtWelcomeMessage.setText("");
                    }
                }
        );
        setContentView(mainContainer);*/
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

           txtWelcomeMessage =new TextView(this);
           txtWelcomeMessage.setText("Hellow");
           txtWelcomeMessage.setLayoutParams(layoutParams2);
           txtWelcomeMessage.setTextSize(20);
           mainContainer.addView(txtWelcomeMessage);

           edtMessage = new EditText(this);
           edtMessage.setLayoutParams(layoutParams2);
           edtMessage.setHint("ENTER");
           mainContainer.addView(edtMessage);

        btnSetMessage = new Button(this);
        btnSetMessage.setText("Set Message");
        mainContainer.addView(btnSetMessage);

        btnSetMessage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtWelcomeMessage.setText(edtMessage.getText().toString());
                    }
                }
        );
        txtWelcomeMessage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtWelcomeMessage.setText("");
                    }
                }
        );

       setContentView(mainContainer);
    }

}
