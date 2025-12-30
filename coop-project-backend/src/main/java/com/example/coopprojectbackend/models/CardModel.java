package com.example.coopprojectbackend.models;

import lombok.Data;

import java.util.List;

@Data
public class CardModel {
    private String id;
    private String lang;
    private String cardName;
    private List<CardVersion> cardVersionList;
    private String cardNumber;
    private String cardOracleText;

    @Data
    public static class CardVersion{
        private CardEdition cardEdition;
    }

    @Data
    public static class CardEdition{
        private String editionName;
        private String editionAcronym;
        private String editionYear;
        private String releaseDate;
    }
}
