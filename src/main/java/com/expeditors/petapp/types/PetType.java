package com.expeditors.petapp.types;

public enum PetType {
    NONE(0), DOG(1), CAT(2), BIRD(3), UNKNOWN(4);

    private int value;
    private PetType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
