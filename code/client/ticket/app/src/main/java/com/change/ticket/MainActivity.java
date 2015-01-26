package com.change.ticket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private ImageView menuButton;
    private ImageView location;
    private TextView city;
    private ListView navigation;

    private DrawerLayout drawerLayout;

    private List<String> navigationItemString = null;
    private ArrayAdapter<String> navigationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuButton = (ImageView)findViewById(R.id.menu_button);
        location = (ImageView)findViewById(R.id.location);
        city = (TextView)findViewById(R.id.city);
        navigation = (ListView)findViewById(R.id.navigation);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);

        initNavigation();

    }

    public void initNavigation()
    {
        navigationItemString = MyDataSource.getNavigationDateaSource();
        navigationAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navigationItemString);
        navigation.setAdapter(navigationAdapter);
        navigation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch(parent.getSelectedItem().toString())
                {
                    case "账号管理":
                        intent = new Intent(MainActivity.this, AccountManager.class);
                        break;
                    case "路线规划":
                        intent = new Intent(MainActivity.this, RoutePlan.class);
                        break;
                    case "提醒":
                        intent = new Intent(MainActivity.this, Prompt.class);
                        break;
                    case "设置":
                        intent = new Intent(MainActivity.this, Setting.class);
                        break;
                    case "关于":
                        intent = new Intent(MainActivity.this, About.class);
                        break;
                    default:
                }
                if (intent != null)
                {
                    startActivity(intent);
                }
            }
        });
    }

}
