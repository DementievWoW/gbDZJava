public class Tusk2 {
    static boolean isNumberSimple(int n) {
        for (int index = 2; index < n; index++) {
            if (n % index == 0 )
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        st.append("1");
        for (int i = 2; i < 1000; i++) {
            if (isNumberSimple(i)) {
                st.append(", ").append(i);
            }
        }
        System.out.println("This is order of simple numbers from 1 to 1000:");
        System.out.println(st);
    }
}
