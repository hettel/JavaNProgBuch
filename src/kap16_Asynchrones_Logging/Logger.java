package kap16_Asynchrones_Logging;
/**

import java.io.FileWriter;
import java.io.IOException;

public class Logger implements AutoCloseable
  public static Logger get()

  public static void log(String msg)
  // Kapazität für den Puffer
  private Logger(String filename)

  private void add(String msg)
    if (logBuffer.length() > CAPACITY)
  private void flush()
      logBuffer.setLength(0);
  @Override
      fileWriter = null;