public class Test {

    public int a = 15;
    public String print(){
        String str = String.format("\"---<%d>---\"", a);
        System.out.println(str);
        return str;
    }

}
