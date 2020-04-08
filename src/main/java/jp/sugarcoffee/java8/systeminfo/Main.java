package jp.sugarcoffee.java8.systeminfo;

public class Main {

  public static void main(String[] args) {

    InformationGetHelper info = new InformationGetHelper();
    MachineData data = new MachineData();

    data.setOperatingSystemName(info.getOSName());
    data.setCPU(info.getCPU());
    data.setGPU(info.getGPU());
    data.setMemoryWrapper(info.getMemory());

    Print print = new Print(data);
    print.machineDataWrite();
  }

}
