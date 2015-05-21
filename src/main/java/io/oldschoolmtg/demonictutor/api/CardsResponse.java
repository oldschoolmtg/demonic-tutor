package io.oldschoolmtg.demonictutor.api;

import java.util.List;

public class CardsResponse {

    private Integer resultSize;

    private List<Card> result;

    public Integer getResultSize() {
        return resultSize;
    }

    public void setResultSize(Integer resultSize) {
        this.resultSize = resultSize;
    }

    public List<Card> getResult() {
        return result;
    }

    public void setResult(List<Card> result) {
        this.result = result;
    }
}
