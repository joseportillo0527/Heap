/* Program Name:  Node.java
* Programmer: Jose Portillo
* Purpose: 
*/
package heapapp;

class Node
   {
   private int iData;             // data item (key)
// -------------------------------------------------------------
   public Node(int key)           // constructor
      { iData = key; }
// -------------------------------------------------------------
   public int getKey()
      { return iData; }
// -------------------------------------------------------------
   public void setKey(int id)
      { iData = id; }
// -------------------------------------------------------------
   }  // end class Node
