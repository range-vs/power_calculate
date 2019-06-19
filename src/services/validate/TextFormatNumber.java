package services.validate;

import javafx.scene.control.TextFormatter;

public class TextFormatNumber {

    public TextFormatter<String> getTextFormatterInteger(){
        return new TextFormatter<>(change -> {
            if (!change.isContentChange()) {
                return change;
            }
            String text = change.getControlNewText();
            if(text.equals("")){
                return change;
            }
            try{
                Integer.parseInt(text);
            }catch (Exception ex){
                return null;
            }
            return change;
        });
    }

    public TextFormatter<String> getTextFormatterFloat(){
        return new TextFormatter<>(change -> {
            if (!change.isContentChange()) {
                return change;
            }
            String text = change.getControlNewText();
            if(text.equals("")){
                return change;
            }
            try{
                Float.parseFloat(text);
            }catch (Exception ex){
                return null;
            }
            return change;
        });
    }

}
