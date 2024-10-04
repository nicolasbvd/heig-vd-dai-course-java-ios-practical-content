package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Readable;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads text files. This implementation reads the file using a buffered reader around
 * a file reader. It manages the reader and the buffered reader properly with a try-with-resources
 * block.
 */
public class BufferedTextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (Reader reader = new FileReader(filename, StandardCharsets.UTF_8);BufferedReader br = new BufferedReader(reader);) {

      // -1 indicates the end of the file
      int c;
      while ((c = br.read()) != -1) {
        //System.out.print(c);
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
