package com.example.androidlayoutstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 点击Linear Layout按钮
        Intent intentLinearLayout = new Intent(this, LinearLayoutActivity.class);
        findViewById(R.id.btn_LinearLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击Linear Layout按钮");
                startActivity(intentLinearLayout);
            }
        });

        // 点击Relative Layout按钮
        Intent intentRelativeLayout = new Intent(this, RelativeLayoutActivity.class);
        findViewById(R.id.btn_RelativeLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击Relative Layout按钮");
                startActivity(intentRelativeLayout);
            }
        });

        // 点击Grid Layout按钮
        Intent intentGridLayout = new Intent(this, GridLayoutActivity.class);
        findViewById(R.id.btn_GridLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击Grid Layout按钮");
                startActivity(intentGridLayout);
            }
        });

        // 点击Table Layout按钮
        Intent intentTableLayout = new Intent(this, TableLayoutActivity.class);
        findViewById(R.id.btn_TableLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击Table Layout按钮");
                startActivity(intentTableLayout);
            }
        });

        // 点击Frame Layout按钮
        Intent intentFrameLayout = new Intent(this, FrameLayoutActivity.class);
        findViewById(R.id.btn_FrameLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击Frame Layout按钮");
                startActivity(intentFrameLayout);
            }
        });

        // 点击Constraint Layout按钮
        Intent intentConstraintLayout = new Intent(this, ConstraintLayoutActivity.class);
        findViewById(R.id.btn_ConstraintLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击Constraint Layout按钮");
                startActivity(intentConstraintLayout);
            }
        });
    }
}