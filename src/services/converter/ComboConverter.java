package services.converter;

import javafx.collections.FXCollections;
import view.binding.BindingControl;
import view.binding.ComboBindingControl;

import java.util.concurrent.atomic.AtomicInteger;

public class ComboConverter extends Converter {

    private Integer [] data;
    private AtomicInteger current;

    public ComboConverter(Integer[] data, AtomicInteger  cur) {
        if(data != null && data.length != 0) {
            this.data = data;
            current = cur;
        }
    }

    @Override
    public BindingControl createNode() {
        return new ComboBindingControl<Integer>(FXCollections.observableArrayList(data), current);
    }

}
