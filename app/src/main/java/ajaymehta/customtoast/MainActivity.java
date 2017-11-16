package ajaymehta.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void print(View view) {


        Toast toast = Toast.makeText(MainActivity.this, "   Hello I am Toast   ", Toast.LENGTH_LONG);
        toast.show();
        View view1 = toast.getView();
        view1.setBackgroundResource(R.drawable.toast);
    }
}
