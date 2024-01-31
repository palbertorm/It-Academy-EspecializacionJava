package org.example;

public class Country extends Contact {
    @Override
    public Location createLocation(String location) {
        if (location.equalsIgnoreCase("ARGENTINA")) {
            return new Argentina();
        }
        return null;
    }

    @Override
    public Code createCode(String location) {
        return new Argentina();
    }
}
