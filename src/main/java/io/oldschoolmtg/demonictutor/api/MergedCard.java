package io.oldschoolmtg.demonictutor.api;

import java.util.List;
import java.util.Set;

public class MergedCard {

    private String name;

    private String searchName;

    private String description;

    private String flavor;

    private List<String> colors;

    private String manaCost;

    private Integer convertedManaCost;

    private List<String> cardSetNames;

    private String type;

    private String subType;

    private Integer power;

    private Integer toughness;

    private Integer loyalty;

    private String rarity;

    private Set<String> artists;

    private List<String> cardSetIds;

    private Boolean token;

    private Boolean promo;

    private List<Ruling> rulings;

    private List<Format> formats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public Integer getConvertedManaCost() {
        return convertedManaCost;
    }

    public void setConvertedManaCost(Integer convertedManaCost) {
        this.convertedManaCost = convertedManaCost;
    }

    public List<String> getCardSetNames() {
        return cardSetNames;
    }

    public void setCardSetNames(List<String> cardSetNames) {
        this.cardSetNames = cardSetNames;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getToughness() {
        return toughness;
    }

    public void setToughness(Integer toughness) {
        this.toughness = toughness;
    }

    public Integer getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Integer loyalty) {
        this.loyalty = loyalty;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Set<String> getArtists() {
        return artists;
    }

    public void setArtists(Set<String> artists) {
        this.artists = artists;
    }

    public List<String> getCardSetIds() {
        return cardSetIds;
    }

    public void setCardSetIds(List<String> cardSetIds) {
        this.cardSetIds = cardSetIds;
    }

    public Boolean isToken() {
        return token;
    }

    public void setToken(Boolean token) {
        this.token = token;
    }

    public Boolean isPromo() {
        return promo;
    }

    public void setPromo(Boolean promo) {
        this.promo = promo;
    }

    public List<Ruling> getRulings() {
        return rulings;
    }

    public void setRulings(List<Ruling> rulings) {
        this.rulings = rulings;
    }

    public List<Format> getFormats() {
        return formats;
    }

    public void setFormats(List<Format> formats) {
        this.formats = formats;
    }
}
