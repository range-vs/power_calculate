package view.binding.types;

import javafx.scene.control.TextField;
import services.validate.TextFormatNumber;

import java.util.concurrent.atomic.AtomicInteger;

public class BindingInteger extends BindingType {

    private AtomicInteger data;

    public BindingInteger(AtomicInteger data){
        this.data = data;
        onKeyUp = event -> { // validate data
            if(((TextField) event.getSource()).getText().equals("")){
                this.data.set(0);
            } else {
                this.data.set(Integer.parseInt(((TextField) event.getSource()).getText()));
            }
        };
        textFormat = new TextFormatNumber().getTextFormatterInteger();
    }

    @Override
    public void setBindingType(TextField n) {
        n.setOnKeyTyped(onKeyUp);
        n.setTextFormatter(textFormat);
    }

    @Override
    public void setDefaultValue() {
        data.set(0);
    }
}
