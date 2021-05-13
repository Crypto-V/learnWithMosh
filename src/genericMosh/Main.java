package genericMosh;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("B");
        for(String item1 : list){
            System.out.println(item1);
        }
    }
}
