package com.engineer.yt.modules.video.domain.objects;

import lombok.Getter;

@Getter
public class Title {
    private String value;

    public Title(String value) {
        this.value = value;
    }

    public void validate() {
    }
}
