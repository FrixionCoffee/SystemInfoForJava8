package jp.sugarcoffee.java8.systeminfo.wrapper;

import oshi.software.os.OperatingSystem;

public class OSInfoWrapper implements InfoWrapper {

  private final OperatingSystem os;

  public OSInfoWrapper(OperatingSystem os) {
    this.os = os;

    infoList.add("OS:"+os.getFamily()+os.getVersionInfo());
    infoList.add("bit:"+ os.getBitness());

  }

}
