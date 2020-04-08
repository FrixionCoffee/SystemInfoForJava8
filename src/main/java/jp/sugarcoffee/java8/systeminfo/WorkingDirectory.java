package jp.sugarcoffee.java8.systeminfo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkingDirectory {

  private static String appData = System.getProperty("user.home");
  static Path dirPath = Paths.get(appData, "Desktop");

  static void overWrite(String path) {
    dirPath = Paths.get(path);
  }
}
