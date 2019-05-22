package com.climbing.ticklist.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public enum Grade {
    TROIS_A ("3a"),
    TROIS_A_PLUS ("3a+"),
    TROIS_B ("3b"),
    TROIS_B_PLUS ("3b+"),
    TROIS_C ("3c"),
    TROIS_C_PLUS ("3c+"),
    QUATRE_A ("4a"),
    QUATRE_A_PLUS ("4a+"),
    QUATRE_B ("4b"),
    QUATRE_B_PLUS ("4b+"),
    QUATRE_C ("4c"),
    QUATRE_C_PLUS ("4c+"),
    CINQ_A ("5a"),
    CINQ_A_PLUS ("5a+"),
    CINQ_B ("5b"),
    CINQ_B_PLUS ("5b+"),
    CINQ_C ("5c"),
    CINQ_C_PLUS ("5c+"),
    SIX_A ("6a"),
    SIX_A_PLUS ("6a+"),
    SIX_B ("6b"),
    SIX_B_PLUS ("6b+"),
    SIX_C ("6c"),
    SIX_C_PLUS ("6c+"),
    SEPT_A ("7a"),
    SEPT_A_PLUS ("7a+"),
    SEPT_B ("7b"),
    SEPT_B_PLUS ("7b+"),
    SEPT_C ("7c"),
    SEPT_C_PLUS ("7c+"),
    HUIT_A ("8a"),
    HUIT_A_PLUS ("8a+"),
    HUIT_B ("8b"),
    HUIT_B_PLUS ("8b+"),
    HUIT_C ("8c"),
    HUIT_C_PLUS ("8c+"),
    NEUF_A ("9a"),
    NEUF_A_PLUS ("9a+"),
    NEUF_B ("9b"),
    NEUF_B_PLUS ("9b+"),
    NEUF_C ("9c"),
    NEUF_C_PLUS ("9c+");

    @Column
    private String cotation;

    private Grade(String cotation){
        this.cotation = cotation;
    }
}
