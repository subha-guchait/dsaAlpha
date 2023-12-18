public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // to add character in stringBuilder
        }
        // tc = 0(n)
        // if it is string tc = 0(n2)
        System.out.println(sb);
        System.out.println(sb.length());
    }

}
