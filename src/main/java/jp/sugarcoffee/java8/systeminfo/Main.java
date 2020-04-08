package jp.sugarcoffee.java8.systeminfo;

import jp.sugarcoffee.java8.systeminfo.wrapper.CPUInfoWrapper;
import jp.sugarcoffee.java8.systeminfo.wrapper.GPUInfoWrapper;
import jp.sugarcoffee.java8.systeminfo.wrapper.GlobalMemoryInfoWrapper;
import jp.sugarcoffee.java8.systeminfo.wrapper.InfoWrapper;
import jp.sugarcoffee.java8.systeminfo.wrapper.OSInfoWrapper;

public class Main {

  public static void main(String[] args) {

    if (args.length == 1) {
      WorkingDirectory.overWrite(args[0]);
    }

    InformationGetHelper info = new InformationGetHelper();
    InfoWrapper.infoList.add("--System info for Java8 start--");

    new OSInfoWrapper(info.getOS());
    new CPUInfoWrapper(info.getCPU());
    new GPUInfoWrapper(info.getGPU());
    new GlobalMemoryInfoWrapper(info.getMemory());

    InfoWrapper.infoList.add("--System info for Java8 end--");

    Print print = new Print();
    print.machineDataWrite();
  }

}
