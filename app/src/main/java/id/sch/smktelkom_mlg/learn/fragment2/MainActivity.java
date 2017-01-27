package id.sch.smktelkom_mlg.learn.fragment2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mNO;
    private TextView tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSelector();

        mNO = 1;
        changePage(mNO);
    }

    private void changePage(int no) {
        changeNumber(no);
        changeFragment(no);
    }

    private void changeNumber(int no) {
        tvNumber.setText(String.valueOf(no));
    }

    private void initSelector() {
        tvNumber = (TextView) findViewById(R.id.textViewNumber);
        findViewById(R.id.buttonPrev)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mNO > 1) {
                            changePage(--mNO);
                        }
                    }
                });
        findViewById(R.id.buttonNext)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mNO < 3) {
                            changePage(++mNO);
                        }
                    }
                });
    }

    private void changeFragment(int no) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = null;

        switch (no) {
            case 1:
                fragment = View1Fragment.newInstance(
                        R.drawable.ic_brightness_5_black_24dp, "Matahari");
                break;
            case 2:
                fragment = View1Fragment.newInstance(
                        R.drawable.ic_brightness_2_black_24dp, "Bulan");
                break;
            case 3:
                fragment = View1Fragment.newInstance(
                        R.drawable.ic_wb_cloudy_black_24dp, "Awan");
                break;
        }

        fm.beginTransaction().replace(R.id.container, fragment).commitNow();
    }
}
