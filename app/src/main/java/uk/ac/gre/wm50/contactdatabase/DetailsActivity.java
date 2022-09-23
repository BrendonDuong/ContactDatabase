package uk.ac.gre.wm50.contactdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        DatabaseHelper db = new DatabaseHelper(this);

        String details = db.getDetails();

        TextView detailsTxt = findViewById(R.id.detailsText);

        detailsTxt.setText(details);
    }
}