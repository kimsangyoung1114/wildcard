package test2;

class ThreadTest extends Thread {
   private int end = 0;
   private int cnt = 0;
   private String name;
   private boolean isCrack = false;

   public ThreadTest(String name, int end) {
      this.end = end;
      this.name = name;

   }

   public ThreadTest(String name, int end, boolean isCrack) {
      this(name, end);
      this.isCrack = isCrack;

   }

   public void run() {
      for (;;)
         try {
            if (this.isCrack) {
               Thread.sleep(800);
            } else {
               Thread.sleep(1000);
            }
            this.cnt++;
            System.out.println(this.name + "이" + this.cnt + "트랙 도는중");
            if (this.end < cnt) {
               System.out.println(this.name + "종료됨");
               break;
            }
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
   }
}

public class Execute {
   public static void main(String[] args) {
//      long sTime = System.currentTimeMillis();
//      for(int i =1; i<=10;i++) {
//      Thread t = new ThreadTest("이름"+i,1);
//      t.start();
//      try {
//         t.join();
//      } catch (InterruptedException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
//      }
//      long eTime = System.currentTimeMillis();
//      System.out.println(eTime-sTime);

      Thread t1 = new ThreadTest("1번말", 3);
      Thread t2 = new ThreadTest("2번말", 3, true);
      Thread t3 = new ThreadTest("3번말", 3);
      t1.start();
      t2.start();
      t3.start();
   }
}