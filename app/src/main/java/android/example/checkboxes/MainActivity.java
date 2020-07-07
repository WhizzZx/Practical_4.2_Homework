package android.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public boolean chocolate, sprinkles, nuts, cherries, oreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view)
    {
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toppings_label));

        if (chocolate) {
            toppings.append(getString(R.string.chocolate_syrup));
        }

        if (sprinkles) {
            toppings.append(getString(R.string.sprinkles));
        }

        if (nuts) {
            toppings.append(getString(R.string.crushed_nuts));
        }

        if (cherries) {
            toppings.append(getString(R.string.cherries));
        }

        if (oreo) {
            toppings.append(getString(R.string.oreo_cookies_crumbles));
        }

        String toast_message=toppings.toString();
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }


    public void onSubmit(View view) {
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toppings_label));

        if  (((CheckBox) findViewById(R.id.chocolate_syrup)).isChecked())
        {
            chocolate = ((CheckBox) view).isChecked();
            toppings.append(getString(R.string.chocolate_syrup));
        }

        if  (((CheckBox) findViewById(R.id.sprinkles)).isChecked())
        {
            sprinkles = ((CheckBox) view).isChecked();
            toppings.append(getString(R.string.sprinkles));
        }

        if  (((CheckBox) findViewById(R.id.crushed_nuts)).isChecked())
        {
            nuts = ((CheckBox) view).isChecked();
            toppings.append(getString(R.string.crushed_nuts));
        }

        if  (((CheckBox) findViewById(R.id.cherries)).isChecked())
        {
            cherries = ((CheckBox) view).isChecked();
            toppings.append(getString(R.string.cherries));
        }

        if  (((CheckBox) findViewById(R.id.oreo_cookie_crumbles)).isChecked())
        {
            oreo = ((CheckBox) view).isChecked();
            toppings.append(getString(R.string.oreo_cookies_crumbles));
        }

    }
}