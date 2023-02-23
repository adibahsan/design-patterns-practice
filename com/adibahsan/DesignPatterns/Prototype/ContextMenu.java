package com.adibahsan.DesignPatterns.Prototype;

public class ContextMenu {
    public void duplicate (Component component){
        Component newComponent = component.clone();
    }
}
