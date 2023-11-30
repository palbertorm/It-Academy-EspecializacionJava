package org.example;

public class CatchArrayOutOfBounds {
    public static String[] array = new String[3];

    public static String arrayOutOfBones() {
        String palabraOutOfBounds = null;
        int length = array.length;
        try{
            for (int i = 0; i < array.length; i++) {
                array[i] = "Elemento " + (i + 1);
            }
            palabraOutOfBounds = array[6];

        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException(" Error ArrayOutOfBounds" + e.getMessage());

        }
        return palabraOutOfBounds;
    }
}
