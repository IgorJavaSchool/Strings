package yanevskyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ReadWrite {

  /**
   * Reads from console
   */
  public String reads() {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
      String string = reader.readLine();
      reader.close();
      return string;

    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }

  /**
   * Writes in console.
   * @param string This parameter that writes in console.
     */
  public void writes(String string) {
    System.out.println(string);
  }

}