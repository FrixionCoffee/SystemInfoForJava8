package jp.sugarcoffee.java8.systeminfo.wrapper;

import oshi.hardware.CentralProcessor;

public class CPUInfoWrapper implements InfoWrapper{


  private final CentralProcessor CPU;

  public CPUInfoWrapper(CentralProcessor CPU) {
    this.CPU = CPU;
    System.out.println();
    infoList.add("CPU:" + CPU.getProcessorIdentifier().getName());
  }

}
