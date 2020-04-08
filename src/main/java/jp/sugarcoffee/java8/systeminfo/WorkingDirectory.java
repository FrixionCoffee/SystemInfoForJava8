package jp.sugarcoffee.java8.systeminfo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkingDirectory {

  String appData = System.getProperty("user.home");
  Path dirPath = Paths.get(appData, "Desktop");
}
