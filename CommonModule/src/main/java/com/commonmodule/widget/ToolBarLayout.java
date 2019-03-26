package com.commonmodule.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.commonmodule.R;


/**
 * TODO: document your custom view class.
 */
public class ToolBarLayout extends ConstraintLayout {

    private String title;

    public ToolBarLayout(Context context) {
        super(context);
        initView(null, 0);
    }

    public ToolBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(attrs, 0);
    }

    public ToolBarLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView(attrs, defStyle);
    }

    private void initView(AttributeSet attrs, int defStyle) {
        // Load attributes
        final TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.ToolBarLayout, defStyle, 0);
        int baseLayoutId = a.getResourceId(R.styleable.ToolBarLayout_baseLayoutId, -1);
        title = a.getString(R.styleable.ToolBarLayout_title);
        int menuLayoutId = a.getResourceId(R.styleable.ToolBarLayout_menuLayoutId, -1);
        a.recycle();

        LayoutInflater.from(getContext()).inflate(baseLayoutId, this);
        TextView titleTextView = findViewById(R.id.titleTextView);
        titleTextView.setText(title);
        if (menuLayoutId != -1) {
            LayoutInflater.from(getContext()).inflate(menuLayoutId, this);
        }
    }


}
