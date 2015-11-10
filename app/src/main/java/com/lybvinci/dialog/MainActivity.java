package com.lybvinci.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view){
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.dialog,null);
        Dialog dialog = new Dialog(this,R.style.Translucent_NoTitle);
        dialog.addContentView(view1,new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        dialog.setContentView(view1);
        dialog.show();
    }

    public void showWaitDialog(View view){
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.dialog2,null);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.alpha);
        view1.findViewById(R.id.iv).startAnimation(animation);
        Dialog dialog = new Dialog(this,R.style.Translucent_NoTitle);
        dialog.addContentView(view1,new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        dialog.setContentView(view1);
        dialog.show();
    }
}
