public class Print {
    public int firstPrint = 999999999;
    public String printMethod() {
        String newValue = String.format("\"---<%d>---\"%n",firstPrint);
        System.out.println(newValue);
        return newValue;
    }
}
