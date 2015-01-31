package com.change.ticket;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class AccountManager extends Activity {

    private com.change.ticket.ActionBar actionBar = new com.change.ticket.ActionBar();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_manager);

        actionBar.leftImageView = (ImageView) findViewById(R.id.left_image_view);
        actionBar.rightImageView = (ImageView) findViewById(R.id.right_image_view);
        actionBar.centerTextView = (TextView) findViewById(R.id.center_text_view);

        actionBar.leftImageView.setImageResource(R.drawable.ic_launcher);
        actionBar.rightImageView.setImageResource(R.drawable.ic_launcher);
        actionBar.centerTextView.setText(R.string.title_activity_account_manager);
    }


}
