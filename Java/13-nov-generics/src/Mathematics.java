public class Mathematics<T> {

    @SuppressWarnings("unchecked")
    public T add(T a, T b) {

        if (a instanceof Integer && b instanceof Integer) {
            Integer result = (Integer) a + (Integer) b;
            return (T) result;
        } 
        else if (a instanceof Double && b instanceof Double) {
            Double result = (Double) a + (Double) b;
            return (T) result;
        } 
        else if (a instanceof Float && b instanceof Float) {
            Float result = (Float) a + (Float) b;
            return (T) result;
        } 
        else if (a instanceof Long && b instanceof Long) {
            Long result = (Long) a + (Long) b;
            return (T) result;
        } 
        else if (a instanceof Short && b instanceof Short) {
            Short result = (short) ((Short) a + (Short) b);
            return (T) result;
        } 
        else if (a instanceof Byte && b instanceof Byte) {
            Byte result = (byte) ((Byte) a + (Byte) b);
            return (T) result;
        }

        return null; // unsupported type
    }
}
