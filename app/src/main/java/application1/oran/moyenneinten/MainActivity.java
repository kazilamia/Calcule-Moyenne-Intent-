package application1.oran.moyenneinten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b1;
    float m=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        t1 = (EditText) findViewById (R.id.editText);
        t2 = (EditText) findViewById (R.id.editText2);
        t3 = (EditText) findViewById (R.id.editText3);
        b1 =(Button) findViewById (R.id.button);

        b1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                String val1 = t1.getText ().toString ();
                String val2 = t2.getText ().toString ();
                String val3 = t3.getText ().toString ();
                m=( (Float.parseFloat (val1)+Float.parseFloat (val2)+Float.parseFloat (val3))/3);
                if (m<10){
                    Intent intent = new Intent (MainActivity.this,Main2Activity.class);
                    intent.putExtra ("val",m);
                    startActivity (intent);}
                else{
                    Intent intent2 = new Intent (MainActivity.this,Main3Activity.class);
                    intent2.putExtra ("val",m);
                    startActivity (intent2);}
            }
        });
    }
    }

