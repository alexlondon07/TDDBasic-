package io.github.alexlondon07.tddbasic;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView price, count;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter();
        loadInit();
        seekBar.setMax(100);
        loadListenerSeekBar();
    }

    private void loadListenerSeekBar() {
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int pastyPrice = 400;
                count.setText(String.valueOf(seekBar.getProgress()));
                int totalValue = mainPresenter.getTotal(seekBar.getProgress(), pastyPrice);
                price.setText(String.valueOf(totalValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void loadInit() {
        seekBar = (SeekBar)findViewById(R.id.main_activity_seekBar_count);
        price = (TextView) findViewById(R.id.main_activity_textView_price);
        count = (TextView) findViewById(R.id.main_activity_textView_count);
    }
}
