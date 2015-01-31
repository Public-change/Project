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
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ActionBar actionBar = new ActionBar();
    private ListView navigation;
    private List<String> navigationItemString = null;
    private ArrayAdapter<String> navigationAdapter;

    private ListView stationListView;
    private List<Station> stationList;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar.leftImageView = (ImageView) findViewById(R.id.left_image_view);
        actionBar.rightImageView = (ImageView) findViewById(R.id.right_image_view);
        actionBar.centerTextView = (TextView) findViewById(R.id.center_text_view);
        navigation = (ListView) findViewById(R.id.navigation);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        stationListView = (ListView) findViewById(R.id.station_list);
        initNavigation();

        stationList = new ArrayList<>();
        initStaionList();

        StationAdapter stationAdapter = new StationAdapter(MainActivity.this, R.layout.staion_item, stationList);
        stationListView.setAdapter(stationAdapter);

        actionBar.leftImageView.setImageResource(R.drawable.ic_launcher);
        actionBar.centerTextView.setText(R.string.location);
        actionBar.rightImageView.setImageResource(R.drawable.ic_launcher);


    }

    public void initNavigation() {
        navigationItemString = MyDataSource.getNavigationDateaSource();
        navigationAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navigationItemString);
        navigation.setAdapter(navigationAdapter);
        navigation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                drawerLayout.closeDrawers();
                Intent intent = null;
                switch (navigationItemString.get(position).toString()) {
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
                if (intent != null) {
                    startActivity(intent);
                }
            }
        });
    }

    /*just for test, it will remove later*/
    private void initStaionList() {
        Station a = new Station("北理工1", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station b = new Station("北理工2", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station c = new Station("北理工3", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station d = new Station("北理工4", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station e = new Station("北理工5", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station f = new Station("北理工6", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station g = new Station("北理工7", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station h = new Station("北理工8", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station i = new Station("北理工9", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station j = new Station("北理工10", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station k = new Station("北理工11", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station l = new Station("北理工12", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station m = new Station("北理工13", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station n = new Station("北理工14", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station o = new Station("北理工15", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);
        Station p = new Station("北理工16", "0756-1234567", 5000, "唐家湾金凤路6号", R.drawable.ic_launcher);

        stationList.add(a);
        stationList.add(b);
        stationList.add(c);
        stationList.add(d);
        stationList.add(e);
        stationList.add(f);
        stationList.add(g);
        stationList.add(h);
        stationList.add(j);
        stationList.add(k);
        stationList.add(l);
        stationList.add(m);
        stationList.add(n);
        stationList.add(o);
        stationList.add(p);

    }

}
