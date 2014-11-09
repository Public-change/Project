package com.example.ticketsystem;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Context mContext;
	private Button btnSendBroadcastContext;
	private TextView etBroadcastContent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		
		btnSendBroadcastContext = (Button) findViewById(R.id.sendButton);
		btnSendBroadcastContext.setOnClickListener(new SendBroadcastClickListener());
		etBroadcastContent = (TextView) findViewById(R.id.et_broadcastContent);
	}
	
	private class SendBroadcastClickListener implements OnClickListener 
	{
		@Override
		public void onClick(View v)
		{
			String content = etBroadcastContent.getText().toString().trim();
			if (content.length() < 1)
			{
				Toast.makeText(mContext, etBroadcastContent.getHint(), 1).show();
				return;
			}
			Intent intent = new Intent();
			intent.setAction("com.example.action.TicketSystem");
			intent.putExtra("content", content);
			sendBroadcast(intent);
		}
	}
}
