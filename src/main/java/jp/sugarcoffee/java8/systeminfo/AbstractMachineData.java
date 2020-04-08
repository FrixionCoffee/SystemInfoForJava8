package jp.sugarcoffee.java8.systeminfo;

import jp.sugarcoffee.java8.systeminfo.wrapper.GlobalMemoryInfoWrapper;
import jp.sugarcoffee.java8.systeminfo.wrapper.OSInfoWrapper;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;

/**
 * @deprecated this is bad class use InfoWrapper
 */
@Deprecated
public abstract class AbstractMachineData {

  protected String operatingSystemName;

  protected OSInfoWrapper osInfoWrapper;

  protected CentralProcessor CPU;
  protected GraphicsCard GPU;
  protected GlobalMemoryInfoWrapper memoryWrapper = null;

  @Deprecated
  public String getOperatingSystemName() {
    return operatingSystemName;
  }

  @Deprecated
  public void setOperatingSystemName(String operatingSystemName) {
    this.operatingSystemName = operatingSystemName;
  }

  public CentralProcessor getCPU() {
    return CPU;
  }

  public void setCPU(CentralProcessor CPU) {
    this.CPU = CPU;
  }

  public GraphicsCard getGPU() {
    return GPU;
  }

  public void setGPU(GraphicsCard GPU) {
    this.GPU = GPU;
  }

  public void setMemoryWrapper(GlobalMemory globalMemory) {
    memoryWrapper = new GlobalMemoryInfoWrapper(globalMemory);
  }
}
