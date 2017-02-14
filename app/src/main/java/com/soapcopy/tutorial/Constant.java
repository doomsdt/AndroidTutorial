package com.soapcopy.tutorial;

import com.soapcopy.tutorial.layout_objects.ButtonToIntent;

import java.util.ArrayList;

/**
 * Created by Dev on 2017-02-14.
 */

public class Constant {

    public static ArrayList<ButtonToIntent> buttonsToIntent = new ArrayList<>();

    public void init(){

        buttonsToIntent.add(new ButtonToIntent("Ch 7", new Ch7()));
        buttonsToIntent.add(new ButtonToIntent("Study 08", new Study08()));
        buttonsToIntent.add(new ButtonToIntent("Study 09", new Study09()));
        buttonsToIntent.add(new ButtonToIntent("Study 10", new Study10()));
        buttonsToIntent.add(new ButtonToIntent("Study 11", new Study11()));
        buttonsToIntent.add(new ButtonToIntent("Study 17", new Study17()));

    }

}
