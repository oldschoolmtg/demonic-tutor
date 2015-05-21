package io.oldschoolmtg.demonictutor.api;

import org.joda.time.DateTime;

import java.util.List;

public class CardSet {

    private String id;

    private String name;

    private String type;

    private String block;

    private String description;

    private Integer common;

    private Integer uncommon;

    private Integer rare;

    private Integer mythicRare;

    private Integer basicLand;

    private Integer total;

    private DateTime releasedAt;

    private List<Integer> cardIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCommon() {
        return common;
    }

    public void setCommon(Integer common) {
        this.common = common;
    }

    public Integer getUncommon() {
        return uncommon;
    }

    public void setUncommon(Integer uncommon) {
        this.uncommon = uncommon;
    }

    public Integer getRare() {
        return rare;
    }

    public void setRare(Integer rare) {
        this.rare = rare;
    }

    public Integer getMythicRare() {
        return mythicRare;
    }

    public void setMythicRare(Integer mythicRare) {
        this.mythicRare = mythicRare;
    }

    public Integer getBasicLand() {
        return basicLand;
    }

    public void setBasicLand(Integer basicLand) {
        this.basicLand = basicLand;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public DateTime getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(DateTime releasedAt) {
        this.releasedAt = releasedAt;
    }

    public List<Integer> getCardIds() {
        return cardIds;
    }

    public void setCardIds(List<Integer> cardIds) {
        this.cardIds = cardIds;
    }
}
