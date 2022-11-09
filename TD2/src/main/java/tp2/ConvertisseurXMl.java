package tp2;

import javax.print.Doc;

public class ConvertisseurXMl implements InetrfaceDocument {

    public String doc2XML(Document d){
        return "<xml "+d.getText()+"............";
    }

    @Override
    public String con(Document d) {
        return "<xml "+d.getText()+"............";
    }
}
