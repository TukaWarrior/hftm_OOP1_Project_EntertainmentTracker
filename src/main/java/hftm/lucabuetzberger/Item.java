package hftm.lucabuetzberger;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Item<T> {
    
    private SimpleStringProperty title = new SimpleStringProperty();
    private SimpleStringProperty creator = new SimpleStringProperty();
    private SimpleIntegerProperty releaseYear = new SimpleIntegerProperty();
    private SimpleStringProperty Genre = new SimpleStringProperty();
    private SimpleDoubleProperty length = new SimpleDoubleProperty();
    private SimpleStringProperty rating = new SimpleStringProperty();

}
