package com.soapcopy.tutorial.layout_objects;

import com.soapcopy.tutorial.FunctionActivity;

/**
 * Created by Dev on 2017-02-14.
 */

public class ButtonToIntent {

    String text;
    FunctionActivity activity;

    public ButtonToIntent(String text, FunctionActivity activity){
        this.text = text;
        this.activity = activity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public FunctionActivity getActivity() {
        return activity;
    }

    public void setActivity(FunctionActivity activity) {
        this.activity = activity;
    }
}
