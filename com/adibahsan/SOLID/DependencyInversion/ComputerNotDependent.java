package com.adibahsan.SOLID.DependencyInversion;

public class ComputerNotDependent {
    private final KeyBoard keyboard;
    private final ComputerMonitorInf ComputerMonitorInf;

    public ComputerNotDependent(KeyBoard keyboard, ComputerMonitorInf computerMonitorInf) {
        this.keyboard = keyboard;
        ComputerMonitorInf = computerMonitorInf;
    }
}
