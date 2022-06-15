package enums;

import lombok.Getter;

@Getter
public enum RunType {
    LOCAL("local"),
    REMOTE("remote");

    RunType(final String value) {
        this.value = value;
    }

    private final String value;

}
