package hcmute.spkt18110021.foody_g7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation= (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        changeFragment(new HomeFragment());

        navigation.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.homeFragment:
                    changeFragment(new HomeFragment());
                    break;
                case R.id.historyFragment:
                    changeFragment(new HistoryFragment());
                    break;
//                case R.id.profileFragment:
//                    changeFragment(new ProfileFragment());
//                    break;
            }
            return true;
        });
    }

    public void changeFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}