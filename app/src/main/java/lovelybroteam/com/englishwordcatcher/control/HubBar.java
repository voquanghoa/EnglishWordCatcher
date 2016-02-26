package lovelybroteam.com.englishwordcatcher.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import lovelybroteam.com.englishwordcatcher.R;

/**
 * Created by voqua on 2/26/2016.
 */
public class HubBar extends LinearLayout {
    public HubBar(Context context) {
        super(context);
        initView();
    }

    public HubBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public HubBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView(){
        LayoutInflater.from(getContext()).inflate(R.layout.hub_bar_layout, this, true);
    }
}
