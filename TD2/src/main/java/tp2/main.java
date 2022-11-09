package tp2;

public class main {

    public static void main(String[] args) {
        Document d=new Document("first");
        InetrfaceDocument id=new ConvertisseurJson();
        System.out.println(id.con(d));
        InetrfaceDocument id2=new ConvertisseurXMl();
        System.out.println(id2.con(d));

    }
}
