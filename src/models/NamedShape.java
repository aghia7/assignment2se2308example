package models;

import interfaces.Shape;

public abstract class NamedShape implements Shape {
    private String name;

    public NamedShape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
