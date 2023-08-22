package com.engineer.yt.modules.video.domain.objects;

import lombok.Getter;

@Getter
public class Description {
    private String value;

    public Description(String value) {
        this.value = value;
    }

    public void validate() {
    }
}
