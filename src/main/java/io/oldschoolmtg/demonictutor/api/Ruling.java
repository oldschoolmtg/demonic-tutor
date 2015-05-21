package io.oldschoolmtg.demonictutor.api;

import org.joda.time.DateTime;

public class Ruling {

    private DateTime releasedAt;

    private String rule;

    public DateTime getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(DateTime releasedAt) {
        this.releasedAt = releasedAt;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
}
