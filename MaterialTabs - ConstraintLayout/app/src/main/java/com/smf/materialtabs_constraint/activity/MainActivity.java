package com.smf.materialtabs_constraint.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.smf.materialtabs_constraint.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnSimpleTabs, btnTSSGTabs, btnScrollableTabs, btnIconTextTabs, btnIconTabs, btnCustomIconTextTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
        btnTSSGTabs = (Button) findViewById(R.id.btnTSSGTabs);
        btnScrollableTabs = (Button) findViewById(R.id.btnScrollableTabs);
        btnIconTextTabs = (Button) findViewById(R.id.btnIconTextTabs);
        btnIconTabs = (Button) findViewById(R.id.btnIconTabs);
        btnCustomIconTextTabs = (Button) findViewById(R.id.btnCustomIconTabs);

        btnSimpleTabs.setOnClickListener(this);
        btnTSSGTabs.setOnClickListener(this);
        btnScrollableTabs.setOnClickListener(this);
        btnIconTextTabs.setOnClickListener(this);
        btnIconTabs.setOnClickListener(this);
        btnCustomIconTextTabs.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSimpleTabs:
                startActivity(new Intent(MainActivity.this, SimpleTabsActivity.class));
                break;
            case R.id.btnTSSGTabs:
                startActivity(new Intent(MainActivity.this, TSSGTabsActivity.class));
                break;
            case R.id.btnScrollableTabs:
                startActivity(new Intent(MainActivity.this, ScrollableTabsActivity.class));
                break;
            case R.id.btnIconTextTabs:
                startActivity(new Intent(MainActivity.this, IconTextTabsActivity.class));
                break;
            case R.id.btnIconTabs:
                startActivity(new Intent(MainActivity.this, IconTabsActivity.class));
                break;
            case R.id.btnCustomIconTabs:
                startActivity(new Intent(MainActivity.this, CustomViewIconTextTabsActivity.class));
                break;
        }
    }
}
