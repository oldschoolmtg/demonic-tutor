package io.oldschoolmtg.demonictutor.api;

import java.util.List;

public class SetsResponse {

    private Integer resultSize;

    private List<CardSet> result;

    public Integer getResultSize() {
        return resultSize;
    }

    public void setResultSize(Integer resultSize) {
        this.resultSize = resultSize;
    }

    public List<CardSet> getResult() {
        return result;
    }

    public void setResult(List<CardSet> result) {
        this.result = result;
    }


}
