package org.araujo;

public class DesktopCreator extends DeviceCreator {

    @Override
    public Device createDevice() {
        return new Desktop();
    }
}
