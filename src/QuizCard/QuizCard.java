package QuizCard;

import java.io.*;

  class DungeopnGame implements Serializable {
      public int x = 3;
      transient long y = 3;
      private short z = 5;
      int getX() {
          return x;
          () {
              return (int) y;
          }
          short getZ() {
              return z;
          }
      }
      class DungeonTest {
          public static void main(String[] args) {
              DungeopnGame d = new DungeopnGame();
              System.out.println(d.getX() + d.getY() + d.getZ());
              try {
                  FileOutputStream fos = new FileOutputStream("dg.ser");
                  ObjectOutputStream oos = new ObjectOutputStream(fos);
                  oos.writeObject(d);
                  oos.close();
                  FileInputStream fis = new FileInputStream("dg.ser");
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  d = (DungeopnGame) ois.readObject();
                  ois.close();
              } catch (Exception e) {
                  e.printStackTrace();
              }
              System.out.println(d.getX() + d.getY() + d.getZ());
          }
      }

      private int getZ() {
      }

      private int getY() {
      }
  }