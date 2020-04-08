package jp.sugarcoffee.java8.systeminfo.wrapper;

import oshi.hardware.GlobalMemory;

public class GlobalMemoryInfoWrapper implements InfoWrapper{

  private final GlobalMemory memory;

  public GlobalMemoryInfoWrapper(GlobalMemory memory) {
    this.memory = memory;

    double memorySize = convertMemory(memory.getTotal());
    infoList.add("physical RAM:" + memorySize + "GB");

  }

  double convertMemory(long memoryByte){
    double memorySize = (double) memoryByte;
    final double GB = Math.pow(2d,30d);
    final double result = memorySize / GB;
    return Math.round(result);
  }

}
