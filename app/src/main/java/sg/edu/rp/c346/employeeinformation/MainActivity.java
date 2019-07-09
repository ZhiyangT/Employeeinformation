package sg.edu.rp.c346.employeeinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;
    ArrayList<AndroidVersion> alInfo;
    ArrayAdapter aaList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.listViewInfo);

        alInfo = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("John","Software Technical Leader", 3400.0);
        AndroidVersion item2 = new AndroidVersion("May","Programmer", 2200.0);

        alInfo.add(item1);
        alInfo.add(item2);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.info, alInfo);
        lvInfo.setAdapter(adapter);



    }
}
