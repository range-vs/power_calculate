package view.binding;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

import java.util.concurrent.atomic.AtomicInteger;

public class ComboBindingControl<T> extends ComboBox implements BindingControl {

    private AtomicInteger current;

    public ComboBindingControl(ObservableList<T> items, AtomicInteger cur){
        super(items);
        current = cur;
        getSelectionModel().select(0);
        setOnAction(event -> current.set((Integer) this.getValue()));
    }

    @Override
    public void clearData() {
        getSelectionModel().select(0);
    }
}
