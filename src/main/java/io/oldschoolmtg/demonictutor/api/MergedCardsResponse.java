package io.oldschoolmtg.demonictutor.api;

import java.util.List;

public class MergedCardsResponse {

    private Integer resultSize;

    private List<MergedCard> result;

    public Integer getResultSize() {
        return resultSize;
    }

    public void setResultSize(Integer resultSize) {
        this.resultSize = resultSize;
    }

    public List<MergedCard> getResult() {
        return result;
    }

    public void setResult(List<MergedCard> result) {
        this.result = result;
    }
}
