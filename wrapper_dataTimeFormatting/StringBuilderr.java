package wrapper_dataTimeFormatting;

public class StringBuilderr {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringBuilderr(String name) {

        this.name = name;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("Hello ");
        stringBuilder.append(" TUIT");
        stringBuilder.insert(6, "or WELCOME");
        System.out.println(stringBuilder);
        stringBuilder.delete(6, 17);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
