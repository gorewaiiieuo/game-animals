package guohuayu.com.gameanimal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_play, btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_play = findViewById(R.id.btn_play);
        btn_exit = findViewById(R.id.btn_exit);
        Typeface tf = Typeface.createFromAsset(getAssets(),"font/a.ttf");
        btn_play.setTypeface(tf);
        btn_exit.setTypeface(tf);

        btn_play.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_play:
                Intent intent = new Intent(MainActivity.this, LevelOne.class);
                startActivity(intent);
                break;
            case R.id.btn_exit:
                this.finish();
                break;
        }
    }
}
