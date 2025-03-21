package CodeWars;

public class ArrayToCSV {

    public static String ToCSVText(int[][] array){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){

                if (j + 1 == array[i].length){
                    stringBuilder.append(array[i][j]);
                } else {
                    stringBuilder.append(array[i][j] + ",");
                }
            }
            if (i + 1 != array.length) stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

}
