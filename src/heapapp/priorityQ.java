/* Program Name:  priorityQ.java
* Programmer: Jose Portillo
*/

package heapapp;

class PriorityQ extends Heap
   {
//-------------------------------------------------------------
   public PriorityQ(int s)          // constructor
      {
       super(s);
      } 
//-------------------------------------------------------------
   public boolean insertQ(int item)    // insert item
      {
      int j;
      Node newNode = new Node(item);

      if(currentSize==0)                         // if no items,
      {
         heapArray[currentSize] = newNode;         // insert at 0
         trickleUp(currentSize++);
      }
      else                                // if items,
         {
           heapArray[currentSize] = newNode;
           trickleUp(currentSize++);
         }
      return true;
      }  // end insert()
//-------------------------------------------------------------

public void insertAt(int index, Node newNode)
 {
  heapArray[index] = newNode;
 }
////-------------------------------------------------------------
//   public boolean isFull()          // true if queue is full
//      { return (nItems == maxSize); } 
////-------------------------------------------------------------
   }  // end class PriorityQ
