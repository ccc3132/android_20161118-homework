package com.example.ss.selectmoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        init();
    }
    void init(){
        CheckBox check;

         final LinearLayout layout2;



        final RadioButton Dog;
        final RadioButton Cat;
        final RadioButton Rabbit;
       final RadioGroup radioGroup;
        final ImageView iDog;
        final ImageView iCat;
        final ImageView iRabbit;

        check = (CheckBox) findViewById(R.id.checkBox);
        layout2 = (LinearLayout) findViewById(R.id.layout2);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        Dog = (RadioButton)findViewById(R.id.Radiodog);
        Cat = (RadioButton)findViewById(R.id.Radiocat);
        Rabbit = (RadioButton)findViewById(R.id.Radiorabbit);
        iDog = (ImageView)findViewById(R.id.imageView);
        iCat = (ImageView)findViewById(R.id.imageView2);
        iRabbit = (ImageView)findViewById(R.id.imageView3);




        layout2.setVisibility(View.GONE);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked){

                if(isChecked)
                    layout2.setVisibility(View.VISIBLE);

                else
                    layout2.setVisibility(View.GONE);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                {
                    if(Dog.isChecked())
                    {

                        iDog.setImageResource(R.drawable.dog);

                    }
                    else if(Cat.isChecked())
                    {
                        iCat.setImageResource(R.drawable.cat);
                    }
                    else if(Rabbit.isChecked())
                    {
                        iRabbit.setImageResource(R.drawable.rabit);
                    }
                }
            }
        });
    }
}
