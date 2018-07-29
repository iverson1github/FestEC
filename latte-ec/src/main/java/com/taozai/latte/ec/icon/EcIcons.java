package com.taozai.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by taozi on 18/5/15.
 */

public enum EcIcons implements Icon {
    icon_scan('\ue64b'),
    icon_ali_pay('\ue8e4');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
