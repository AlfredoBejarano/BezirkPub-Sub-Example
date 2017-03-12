package com.alfredobejarano.bezirkpubexample.factory;

import com.alfredobejarano.bezirkpubexample.R;
import com.alfredobejarano.bezirkpubexample.utils.ProjectUtils;

/**
 * Created by jacbe on 11/03/2017.
 */

public class KeyViewIdFactory {
    public int getKeyViewId(int id) {
        int key;
        switch (id) {
            case R.id.back_button:
                key = ProjectUtils.LEFT_ARROW;
                break;
            case R.id.forward_button:
                key = ProjectUtils.RIGHT_ARROW;
                break;
            case R.id.play_button:
                key = ProjectUtils.SPACE_BAR;
                break;
            case R.id.volume_up_button:
                key = ProjectUtils.UP_ARROW;
                break;
            default:
                key = ProjectUtils.DOWN_ARROW;
                break;
        }
        return key;
    }
}
