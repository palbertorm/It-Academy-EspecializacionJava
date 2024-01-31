package org.example;

public class Argentina implements Location, Code
{
    @Override
    public String codeZone() {
        return "+54";
    }
    @Override
    public String nameLocation() {
        return "Argentina";
    }
}
