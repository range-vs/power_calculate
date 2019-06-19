package view.binding.types;

import javafx.scene.control.TextField;
import services.validate.TextFormatNumber;

import java.util.concurrent.atomic.AtomicReference;

public class BindingFloat extends BindingType {

    private AtomicReference<Float> data;

    public BindingFloat(AtomicReference<Float> data){
        this.data = data;
        onKeyUp = event -> { // validate data
            if(((TextField) event.getSource()).getText().equals("")){
                this.data.set(0.f);
            } else {
                this.data.set(Float.parseFloat(((TextField) event.getSource()).getText()));
            }
        };
        textFormat = new TextFormatNumber().getTextFormatterFloat();
    }

    @Override
    public void setBindingType(TextField n) {
        n.setOnKeyTyped(onKeyUp);
        n.setTextFormatter(textFormat);
    }

    @Override
    public void setDefaultValue() {
        data.set(0.f);
    }
}
