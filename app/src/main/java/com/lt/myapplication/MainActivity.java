package com.lt.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author liutao15
 * @version 4.2.0
 * @since 2020/8/7
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        NDKTool tool = new NDKTool();
        TextView textView = findViewById(R.id.TextView);
        textView.setText(tool.getStringFromNDK());

    }
}
