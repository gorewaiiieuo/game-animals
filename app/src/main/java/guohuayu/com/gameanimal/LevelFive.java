package guohuayu.com.gameanimal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LevelFive extends AppCompatActivity implements View.OnClickListener {


    private TextView tv_itemname;

    private ImageView iv_1, iv_2, iv_3, iv_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_five);

        initView();
    }

    private void initView() {
        tv_itemname = findViewById(R.id.tv_itemname);
        Typeface tf = Typeface.createFromAsset(getAssets(),"font/a.ttf");
        tv_itemname.setTypeface(tf);

        tv_itemname.setText("kangaroo?");

        iv_1 = findViewById(R.id.iv_1);
        iv_2 = findViewById(R.id.iv_2);
        iv_3 = findViewById(R.id.iv_3);
        iv_4 = findViewById(R.id.iv_4);

        iv_1.setOnClickListener(this);
        iv_2.setOnClickListener(this);
        iv_3.setOnClickListener(this);
        iv_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_1:
                Toast.makeText(this,"congratulation! You have accomplished!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LevelFive.this, MainActivity.class);
                startActivity(intent);
                this.finish();
                break;
            case R.id.iv_2:
                Toast.makeText(this,"Oops!Wrong choice.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_3:
                Toast.makeText(this,"Oops!Wrong choice.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_4:
                Toast.makeText(this,"Oops!Wrong choice.", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
