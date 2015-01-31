package com.change.ticket;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/1/29.
 */
public class ActionBar {

    ImageView leftImageView;
    ImageView rightImageView;
    TextView centerTextView;

    //TODO: need to and some function to init actionbar layout and resource
    public void setLeftImageView(ImageView leftImageView) {
        this.leftImageView = leftImageView;
    }

    public void setRightImageView(ImageView rightImageView) {
        this.rightImageView = rightImageView;
    }

    public void setCenterTextView(TextView centerTextView) {
        this.centerTextView = centerTextView;
    }

}
