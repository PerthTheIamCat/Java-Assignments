public class Max {
    /** Return the maximum of two objects */
    public static Comparable<Object> max(Comparable<Object> o1, Comparable<Object> o2){
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}
