public class Main {


    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Некорректный размер массива");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Не возможно преобразовать строку в цисло");
            System.out.println("Некорректная ячейка: " + e.i + "x" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

    public static class MyArrayDataException extends Exception {
        int i;
        int j;

        MyArrayDataException(int i, int j) {
            this.i = i;
            this.j = j;

        }

    }


    public static class MyArraySizeException extends Exception {

        MyArraySizeException(String message) {
            super(message);

        }


    }


}
