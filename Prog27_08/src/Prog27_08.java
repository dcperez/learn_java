//Program 27_06: returning arrays (compare to Prog27_06)

public class Prog27_08 {

    public static void main(String[] args) {

        new Prog27_08();
    }

    public Prog27_08() {
        char[] arr = new char[5]; //have to fully extentuate array
        fillArray(arr);

        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void fillArray(char[] a) {
        a[0] = 'A';
        a[1] = 'E';
        a[2] = 'I';
        a[3] = 'O';
        a[4] = 'U';
    }
}
