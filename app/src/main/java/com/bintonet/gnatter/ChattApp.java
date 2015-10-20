package com.bintonet.gnatter;

/**
 * Created by darren on 17/12/14.
 */

import android.app.Application;

import com.parse.Parse;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

    /* (non-Javadoc)
     * @see android.app.Application#onCreate()
     */
    @Override
    public void onCreate()
    {
        super.onCreate();

        Parse.initialize(this, "K4UTdVhNskSi5IyrcakAPg3RjRLF9z4XEDo8v2P1", "FZdDxfDCEFxaHITocsNHoeeXdUFN494f1GABuqKi");


    }
}

