package com.example.ariix.mytitle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyTopBar topBar = findViewById(R.id.topbar);
        topBar.setRightButtonVisibility(false);
        topBar.setOnLeftAndRightClickListener(new MyTopBar.OnLeftAndRightClickListener() {
            @Override
            public void OnLeftButtonClick() {
                finish();//左边按钮实现的功能逻辑
            }
            @Override
            public void OnRightButtonClick() {
            //右边按钮实现的功能逻辑
                Toast.makeText(MainActivity.this, "RightButton", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
