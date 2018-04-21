package application1.oran.moyenneinten;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main3);
        text =(TextView)findViewById (R.id.text3);
        float vall= getIntent ().getFloatExtra ("val",0);

        text.setText("Felicitation !!!! vous avez reussi votre moyenne est "+vall);
        text.setTextColor(Color.parseColor("#00ff00"));
    }
}
