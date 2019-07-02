package com.company;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Stocks {
    private IntegerProperty id;
    private StringProperty name;
    private IntegerProperty qty;

    public Stocks(Integer Id,String Name, Integer Qty) {
        this.id = new SimpleIntegerProperty(Id);
        this.name = new SimpleStringProperty(Name);
        this.qty = new SimpleIntegerProperty(Qty);
    }

    public int getId() {
        return id.get();
    }

    public void setId(IntegerProperty id) {
        this.id = id;
    }

    public int getQty() {
        return qty.get();
    }

    public void setName(StringProperty name) {
        this.name = name;
    }

    public String getName() {
        return name.get();
    }

    public void setQty(IntegerProperty qty) {
        this.qty = qty;
    }

}
