public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = x - y;
        char calcolo = '-';

        System.out.println("Input values: " + x + " , " + y);
        System.out.println("Input operation: " + x + calcolo + y);
        System.out.println("Input operation : " + operation (calcolo));
        System.out.println("risultato : " + z);

    }

    public static String operation(char calcolo) {

        String opType;
        switch (calcolo) {
            case '+':
                opType = "sum";
                break;

            case '-':
                opType = "substraction";
                break;

            case '*':
                opType = "moltiplication";
                break;

            case '/':
                opType = "division";
                break;

            default:

                opType = " error";

        }
        return opType;

    }
}
