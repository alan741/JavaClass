package com.expeditors.petapp.types;

public enum BreedType {
    NONE(0), MIXED(1), SIAMESE(2), POODLE(3), CHIHUAHUA(4), UNKNOWN(5);

    private int value;
    private BreedType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
