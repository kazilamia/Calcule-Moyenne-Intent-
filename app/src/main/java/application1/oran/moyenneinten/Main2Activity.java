package application1.oran.moyenneinten;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        text =(TextView)findViewById (R.id.text5);
        float vall= getIntent ().getFloatExtra ("val",0);

            text.setText("Dommage.... vous étes recalé" +
                    " Votre moyenne est "+vall);
            text.setTextColor(Color.parseColor("#FF0000"));}
    }

