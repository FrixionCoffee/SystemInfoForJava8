package jp.sugarcoffee.java8.systeminfo;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class InformationGetHelper {

  private final HardwareAbstractionLayer hardware;
  private final OperatingSystem OS;

  public InformationGetHelper() {
    SystemInfo systemInfo = new SystemInfo();
    hardware = systemInfo.getHardware();
    OS = systemInfo.getOperatingSystem();
  }

  CentralProcessor getCPU() {
    return hardware.getProcessor();
  }

  GraphicsCard getGPU() {
    return hardware.getGraphicsCards()[0];
  }

  String getOSName() {
    return OS.getFamily();
  }

  GlobalMemory getMemory() {
    return hardware.getMemory();
  }


}
