package services.converter;

import view.binding.BindingControl;
import view.binding.TextBindingControl;
import view.binding.types.BindingInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class TextConverter extends Converter {

    private AtomicInteger data;

    public TextConverter(AtomicInteger  data) {
        this.data = data;
    }

    @Override
    public BindingControl createNode() {
        return new TextBindingControl(data.toString(), new BindingInteger(data));
    }
}
