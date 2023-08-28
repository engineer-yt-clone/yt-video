package com.engineer.yt.modules.video.domain.objects;

import com.engineer.yt.libs.exceptions.ArgumentInvalidException;
import com.engineer.yt.libs.exceptions.ExceptionBase;
import com.engineer.yt.libs.exceptions.ExceptionCode;
import com.google.common.base.Strings;
import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public class Title {
    private final String value;

    public Title(String value) {
        this.value = value;
        validate();
    }


    public void validate() {
        if (Strings.isNullOrEmpty(this.value)) {
            throw new ArgumentInvalidException("Title is not null");
        }
    }
}
