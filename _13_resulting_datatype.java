public class _13_resulting_datatype {
    public static void main(String[] args) {
        byte b = 23;
        short s = 246;
        int i = 44;
        long l = 7779;
        char c = 'a';
        float f = 23.04f;
        double d = 43.42;

        int bs = b+s;           // byte + short -> returns int type
        int si = s+i;           // short + int -> returns int type
        float lf = l+f;         // long + float -> returns float type
        float If = i+f;         // int + float -> returns float type
        int ci = c+i;           // char + int -> returns int type
        int cs = c+s;           // char + short -> returns short type
        double ld = l+d;        // long + double -> returns double type
        double fd = f+d;        // float + double -> returns double type

        System.out.println(bs);        // byte + short -> int
        System.out.println(si);        // short + int -> int
        System.out.println(lf);        // long + float -> float
        System.out.println(If);        // int + float -> float
        System.out.println(ci);        // char + int -> int
        System.out.println(cs);        // char + short -> short
        System.out.println(ld);        // long + double -> double
        System.out.println(fd);        // float + double -> double
    }
}
