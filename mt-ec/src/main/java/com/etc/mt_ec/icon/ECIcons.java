package com.etc.mt_ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by chenhao on 2017/9/13.
 */

public enum ECIcons implements Icon {
    icon_scan('\ue67c'),
    icon_alipay('\ue66e');

    private char character;

    ECIcons(char character){
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
