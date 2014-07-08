/* Program Name:  HeapApp.java
* Programmer: Jose Portillo
*/

package heapapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HeapApp
   {
   public static void main(String[] args) throws IOException
      {
      int value, value2;
      PriorityQ theQ = new PriorityQ(5);
      int j;
      
      boolean success;

      theQ.insert(30);
      theQ.insert(50);
      theQ.insert(10);
      theQ.insert(40);
      theQ.insert(20);

//      while( !theHeap.isEmpty() )
//         {
//         Node item = theHeap.remove();
//         System.out.print(item + " ");  // 10, 20, 30, 40, 50
//         }  // end while
//      System.out.println("");
      for(j=0; j<=theQ.currentSize; j++) // remove from heap and
        { // store at array end
            Node biggestNode = theQ.remove();
            theQ.insertAt(j, biggestNode);
        }

      while(true)                   // until [Ctrl]-[C]
         {
         System.out.print("Enter first letter of ");
         System.out.print("show, insert, remove, change: ");
         int choice = getChar();
         switch(choice)
            {
            case 's':                        // show
               theQ.displayHeap();
               break;
            case 'i':                        // insert
               System.out.print("Enter value to insert: ");
               value = getInt();
               success = theQ.insert(value);
               if( !success )
                  System.out.println("Can't insert; heap full");
               break;
            case 'r':                        // remove
               if( !theQ.isEmpty() )
                  theQ.remove();
               else
                  System.out.println("Can't remove; heap empty");
               break;
            case 'c':                        // change
               System.out.print("Enter current index of item: ");
               value = getInt();
               System.out.print("Enter new key: ");
               value2 = getInt();
               success = theQ.change(value, value2);
               if( !success )
                  System.out.println("Invalid index");
               break;
            default:
               System.out.println("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
//-------------------------------------------------------------
   public static String getString() throws IOException
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
//-------------------------------------------------------------
   public static char getChar() throws IOException
      {
      String s = getString();
      return s.charAt(0);
      }
//-------------------------------------------------------------
   public static int getInt() throws IOException
      {
      String s = getString();
      return Integer.parseInt(s);
      }
//-------------------------------------------------------------
  }  // end class HeapApp
