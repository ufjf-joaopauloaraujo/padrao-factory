package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceCreatorTest {

    @Test
    void validaLaptopCreator() {
        DeviceCreator creator = new LaptopCreator();
        Device device = creator.createDevice();
        assertEquals(device.getClass(), Laptop.class);
        assertEquals("Hello from Laptop!", device.getHello());
    }

    @Test
    void validaDesktopCreator() {
        DeviceCreator creator = new DesktopCreator();
        Device device = creator.createDevice();
        assertEquals(device.getClass(), Desktop.class);
        assertEquals("Hello from Desktop!", device.getHello());
    }
}