package lovelybroteam.com.englishwordcatcher.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import lovelybroteam.com.englishwordcatcher.R;

/**
 * Created by voqua on 2/26/2016.
 */
public class QuestionView extends LinearLayout {
    public QuestionView(Context context) {
        super(context);
        initView();
    }

    public QuestionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public QuestionView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView(){
        LayoutInflater.from(getContext()).inflate(R.layout.question_view_layout, this, true);
    }
}
