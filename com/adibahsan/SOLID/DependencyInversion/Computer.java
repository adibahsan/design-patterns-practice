package com.adibahsan.SOLID.DependencyInversion;

import javax.management.monitor.Monitor;

public class Computer {
    private final StandardKeyboard keyboard;
    private final ComputerMonitor monitor;

    public Computer() {
        monitor = new ComputerMonitor(); // tightly coupled
        keyboard = new StandardKeyboard(); // tightly coupled
    }
}
