package kap02_Thread_Konzept;

import java.util.Random;
/**
 * Codebeispiel f�r benutzerdefinierte Daemon-Threads
 */
import java.util.concurrent.TimeUnit;

class ClockDaemon implements Runnable
{
  public void run()
  {
    Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
    while (true)
    {
      try
      {
        TimeUnit.SECONDS.sleep(1);
      }       catch (InterruptedException ex)
      {
        return;
      }
      System.out.println(new java.util.Date());
    }
  }
}

public class DaemonThread
{
  public static void main(String[] args)
  {
    Thread clock = new Thread(new ClockDaemon(), "ClockThread");
    // Daemon-Thread, läuft ewig, bis das Programm beendet wird
    clock.setDaemon(true);
    clock.start();
    // Aktivitäten des main-Threads
    Random r = new Random();
    for (int i = 0; i < 100; i++)
    {
      // Simulation einer intensiven Arbeit
      try
      {
        Thread.sleep(r.nextInt(100));
      }       catch (Exception ex)
      {
      }
    }
    // User-Thread wird hiermit beendet
  }
}
