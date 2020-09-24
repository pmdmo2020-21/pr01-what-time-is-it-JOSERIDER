package jose.alvarez.whatTime;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    SimpleDateFormat simpleDateFormat;
    final Locale locale = Locale.getDefault();
    private TextView lbl_date;
    private TextView lbl_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        lbl_date = findViewById(R.id.lbl_date);
        lbl_time = findViewById(R.id.lbl_time);
        setDate();
        setTime();
    }

    private void setDate() {
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", locale);
        String date = simpleDateFormat.format(new Date());
        lbl_date.setText(date);
    }

    private void setTime() {
        simpleDateFormat = new SimpleDateFormat("HH:mm", locale);
        String time = simpleDateFormat.format(new Date());
        lbl_time.setText(time);
    }
}