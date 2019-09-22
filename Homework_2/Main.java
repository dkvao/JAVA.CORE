public class Main {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"5", "1", "7", "3"},
                {"3", "5", "8", "1"},
                {"7", "2", "8", "9"},
                {"0", "5", "3", "9"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6"},
                {"7", "8", "9", "0"},
                {"9", "8", "7", "6"}
        };
        String[][] wrongChar = {
                {"1", "2", "3", "4"},
                {"5", "6", "", "8"},
                {"9", "0", "9", "8"},
                {"7", "6", "5", "4"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
