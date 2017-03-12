package com.alfredobejarano.bezirkpubexample.events;

import com.bezirk.middleware.messages.Event;

/**
 * Created by jacbe on 11/03/2017.
 */

public class SimulateKeyEvent extends Event {
    private final int keyIntegerCode;

    public SimulateKeyEvent(int keyIntegerCode) {
        this.keyIntegerCode = keyIntegerCode;
    }

    public int getKeyIntegerCode() {
        return keyIntegerCode;
    }
}
