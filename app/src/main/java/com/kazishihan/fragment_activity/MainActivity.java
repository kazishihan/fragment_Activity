package com.kazishihan.fragment_activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.edittextid);


    }

    public void button1(View view) {
        FirstFragment fragment1 = new FirstFragment();
        FragmentManager fm1 = getSupportFragmentManager();
        FragmentTransaction ft1 = fm1.beginTransaction();
        ft1.replace(R.id.framelayoutid,fragment1);
        ft1.addToBackStack("first");
        ft1.commit();
    }

    public void button2(View view) {

        SecondFragment fragment2 = new SecondFragment();
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction ft2 = fm2.beginTransaction();
        ft2.replace(R.id.framelayoutid,fragment2);
        ft2.addToBackStack("second");
        ft2.commit();
    }

    public void passValue(View view) {

        String data = editText.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("valuekey",data);
        SecondFragment sf = new SecondFragment();
        sf.setArguments(bundle);
        FragmentManager fmm = getSupportFragmentManager();
        FragmentTransaction ftt = fmm.beginTransaction();
        ftt.replace(R.id.framelayoutid,sf);
        ftt.commit();


    }
}
