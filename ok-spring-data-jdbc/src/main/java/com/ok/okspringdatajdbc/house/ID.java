package com.ok.okspringdatajdbc.house;

public class ID extends ValueObject {
    private String id;

    public ID(String id) {
        this.id = id;
    }

    public ID(ID id) {
        this(id.id());
    }

    public String id() {
        return this.id;
    }

    @Override
    public boolean equals(Object anObject) {
        boolean equalObjects = false;

        if (anObject != null && this.getClass() == anObject.getClass()) {
            HouseId typedObject = (HouseId) anObject;
            equalObjects = this.id().equals(typedObject.id());
        }

        return equalObjects;
    }

    @Override
    public int hashCode() {
        int hashCodeValue =
                + (57853 * 31)
                        + this.id().hashCode();

        return hashCodeValue;
    }

    @Override
    public String toString() {
        return "ID [id=" + id + "]";
    }

    private void setId(String id) {
        if (id == null) {
            throw new IllegalArgumentException("The id must be provided.");
        }

        if (id.length() > 36) {
            throw new IllegalArgumentException("The id must be 36 characters or less.");
        }

        this.id = id;
    }
}
