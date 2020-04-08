package jp.sugarcoffee.java8.systeminfo.wrapper;

import java.util.ArrayList;
import java.util.List;

public interface InfoWrapper {

  List<String> infoList = new ArrayList<>();

    default List<String> getInfoList() {
      return infoList;
    }

}

