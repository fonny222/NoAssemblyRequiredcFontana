package christopher_fontana.noassemblyrequiredcfontana;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Bicycle
        // initialize and reference the button control with the id name of btnBicycle
        Button button = (Button) findViewById(R.id.btnBicycle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Selection.this,Bicycle.class));
            }
        });


        // Dresser
        // initialize and reference the button control with the id name of btnDresser
        Button button2 = (Button) findViewById(R.id.btnDresser);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Selection.this,Dresser.class));
            }
        });

// Patio
        // initialize and reference the button control with the id name of btnPatio
        Button button3 = (Button) findViewById(R.id.btnPatio);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Selection.this,Patio.class));
            }
        });






        // this is not needed but each time I delete it, it causes issues
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
