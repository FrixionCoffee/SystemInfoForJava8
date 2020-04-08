package jp.sugarcoffee.java8.systeminfo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Print {

  public Print() {

  }

  void createDir(Path dirPath) {

    if (Files.isDirectory(dirPath)) {
      return;
    }

    try {
      Files.createDirectory(dirPath);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  @SuppressWarnings("unused")
  void createFile(Path dirPath, String fileName, String fileType) {

    Path filePath = dirPath.resolve(fileName).resolve(fileType);

    if (Files.exists(filePath)) {
      return;
    }

    try {
      Files.createFile(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  void createTextFile(Path dirPath, String fileName) {

    Path filePath = dirPath.resolve(fileName + ".txt");

    if (Files.exists(filePath)) {
      return;
    }

    try {
      Files.createFile(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  void write(Path filePath, List<String> stringList) {

    try {
      Files.write(filePath, stringList, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  void machineDataWrite() {

    WorkingDirectory workingDirectory = new WorkingDirectory();
    Path dirPath = WorkingDirectory.dirPath.resolve("SystemInfoForJava8");
    createDir(dirPath);
    createTextFile(dirPath, "result");

    Path filePath = dirPath.resolve("result.txt");

    write(filePath, jp.sugarcoffee.java8.systeminfo.wrapper.InfoWrapper.infoList);
  }


}
