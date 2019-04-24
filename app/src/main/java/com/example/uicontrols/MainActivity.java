package com.example.uicontrols;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView t;
    EditText e;
    Typeface typeface;
    ToggleButton b;
    SeekBar s1;
    RadioButton font1,font2;
    CheckBox bold,italics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.text2);
        e = findViewById(R.id.edit);
        b = findViewById(R.id.b1);
        s1 = findViewById(R.id.seek);
        font1 = findViewById(R.id.r1);
        font2 = findViewById(R.id.r2);
        bold = findViewById(R.id.check);
        italics = findViewById(R.id.check2);

        s1.setProgress(0);
        s1.setMax(6);
        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int p;
                p = 14 + (progress * 2);
                t.setTextSize(p);

                Toast.makeText(getApplicationContext(), String.valueOf(p), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
//
//        bold.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                //if both are checked
//                if (italics.isChecked() && buttonView.isChecked()) {
//                    if (font2.isChecked()) {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.BOLD_ITALIC);
//                    } else {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD_ITALIC);
//                    }
//                    //if bold are checked but not italics
//                } else if (buttonView.isChecked()) {
//                    if (font2.isChecked()) {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.BOLD);
//                    } else {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD);
//                    }
//                    //if bold is unchecked
//                } else if (!buttonView.isChecked()) {
//                    if (font2.isChecked()) {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.NORMAL);
//                    }else if(bold.isChecked()){
//                            t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD);
//                    } else {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.NORMAL);
//                    }
//                  }
//                }
//
//        });

//        italics.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                //if both are checked
//                if (bold.isChecked() && buttonView.isChecked()) {
//                    if (font2.isChecked()) {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.BOLD_ITALIC);
//                    } else {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD_ITALIC);
//                    }
//                    //if bold are checked but not italics
//                } else if (buttonView.isChecked()) {
//                    if (font2.isChecked()) {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.ITALIC);
//                    } else {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.ITALIC);
//                    }
//                    //if bold is unchecked
//                } else if (!buttonView.isChecked()) {
//                    if (font2.isChecked() && bold.isChecked()) {
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.BOLD);
//                    } else if(bold.isChecked()){
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD);
//                    }else{
//                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.NORMAL
//                        );
//                    }
//                }
//            }
//
//
//        });
//
        italics.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(bold.isChecked() && italics.isChecked()){
                    if (font1.isChecked()){
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD_ITALIC);
                    }else{
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.BOLD_ITALIC);
                    }
                }else if(bold.isChecked() && !italics.isChecked()){
                    if (font1.isChecked()){
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD);
                    }else{
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.BOLD);
                    }
                }else if(!bold.isChecked() && italics.isChecked()){
                    if (font1.isChecked()){
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.ITALIC);
                    }else{
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.ITALIC);
                    }
                }else if(!bold.isChecked()&& !italics.isChecked()){
                    if (font1.isChecked()){
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.NORMAL);
                    }else{
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.NORMAL);
                    }
                }
            }
        });

        bold.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(bold.isChecked() && italics.isChecked()){
                    if (font1.isChecked()){
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD_ITALIC);
                    }else{
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.BOLD_ITALIC);
                    }
                }else if(!bold.isChecked() && italics.isChecked()){
                    if (font1.isChecked()){
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.ITALIC);
                    }else{
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.ITALIC);
                    }
                }else if(bold.isChecked() && !italics.isChecked()){
                    if (font1.isChecked()){
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.BOLD);
                    }else{
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.BOLD);
                    }
                }else if(!bold.isChecked()&& !italics.isChecked()){
                    if (font1.isChecked()){
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul), Typeface.NORMAL);
                    }else{
                        t.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.charlotte), Typeface.NORMAL);
                    }
                }
            }
        });

















        b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b.isChecked()) {
                    Log.d("************", String.valueOf(b.isChecked()));
                    e.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {}

                        @Override
                        public void afterTextChanged(Editable s) {
                            if(b.isChecked()) {
                                t.setText(s);
                            }
                        }
                    });

                }else {
                    Log.d("************", String.valueOf(b.isChecked()));
                }
            }
        });
    }
    public void radioOnClick(View v){
        boolean checked = ((RadioButton)v).isChecked();
        switch (v.getId()){
            case  R.id.r1:
                if (checked)
                    typeface = ResourcesCompat.getFont(MainActivity.this, R.font.precious_soul);
                    t.setTypeface(typeface);
                    bold.setChecked(false);
                    italics.setChecked(false);
                break;
            case  R.id.r2:
                if (checked)
                    typeface = ResourcesCompat.getFont(MainActivity.this, R.font.charlotte);
                    t.setTypeface(typeface);
                    bold.setChecked(false);
                    italics.setChecked(false);
                break;
        }
    }
    public void exitApp(View v){
        finish();

        System.exit(0);
    }

}
