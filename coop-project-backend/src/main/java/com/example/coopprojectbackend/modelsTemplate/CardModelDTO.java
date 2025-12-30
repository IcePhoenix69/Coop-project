package com.example.coopprojectbackend.modelsTemplate;

import com.example.coopprojectbackend.models.CardModel;
import lombok.Data;

import java.util.List;
@Data
public class CardModelDTO {
    private String lang;
    private String cardName;
    private List<CardModel.CardVersion> cardVersionList;
    private String cardNumber;
    private String cardOracleText;

    @Data
    public static class CardVersion{
        private CardModel.CardEdition cardEdition;
    }

    @Data
    public static class CardEdition{
        private String editionName;
        private String editionAcronym;
        private String editionYear;
        private String releaseDate;
    }
}
