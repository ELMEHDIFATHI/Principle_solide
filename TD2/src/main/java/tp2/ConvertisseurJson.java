package tp2;

public class ConvertisseurJson implements InetrfaceDocument {

    public String doc2JSON(Document d){
        return "<json "+d.getText()+"............";
    }

    @Override
    public String con(Document d) {
        return "<json "+d.getText()+"............";
    }
}
