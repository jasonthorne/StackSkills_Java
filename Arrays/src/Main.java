public class Main {

    public static void main(String[] args) {

        int[] intArray1 = {2,4,5,8};
        int[] intArray2 = new int[4];
        intArray2[0] = 12; intArray2[1] = 13; intArray2[2] = 45; intArray2[3] = 23;


        String[] strArray = {"fee", "fi", "fo", "fum"};
        Boolean [] boolArray = {true, false, true, true};

        for (int i = 0; i < intArray1.length; i++) {
            System.out.println(intArray1[i] + " " + strArray[i] + " " + boolArray[i]);

        }

    }
}
