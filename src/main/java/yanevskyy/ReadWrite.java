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
      return reader.readLine();

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