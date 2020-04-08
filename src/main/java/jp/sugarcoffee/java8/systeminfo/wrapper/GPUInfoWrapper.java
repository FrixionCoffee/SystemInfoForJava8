package jp.sugarcoffee.java8.systeminfo.wrapper;

import oshi.hardware.GraphicsCard;

public class GPUInfoWrapper implements InfoWrapper {


  private final GraphicsCard[] GPU;

  public GPUInfoWrapper(GraphicsCard[] graphicsCard) {
    GPU = graphicsCard;

    for (int i = 0; i < graphicsCard.length; i++) {
      infoList.add("GPU" + (i + 1) + ":" + GPU[i].getName() + " " + GPU[i].getVersionInfo());
    }

  }

}
