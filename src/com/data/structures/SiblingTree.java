package com.data.structures;

/**
 * Created with IntelliJ IDEA.
 * User: bazinga
 * Date: 11/30/13
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class SiblingTree {

       SiblingTreeNode root;
       int size ; // Size of the tree .



   public class SiblingTreeNode {

       Object item;
       SiblingTreeNode parent;
       SiblingTreeNode firstChild;
       SiblingTreeNode nextSibling;



       /**
        *   Start with the root node
        *   Visit each node before recursively visiting each children left to right
        *   Order of visitation
        *
        *   Pre-Order traversal
        *           1
        *          / \
        *         2   5
        *        / \   \
        *       3   4   6
        *     Entire Pre-order traversal takes linear order time O(n)
        *     where n is the number of nodes in the tree
        *     Best example would be ls -l ( it uses pre-order traversal
        *
        *
        */

       public void preOrderTraversal()
       {

         visit(this);
         if(firstChild!=null)
         {
             firstChild.preOrderTraversal();
         }

         if(nextSibling!=null)
         {
             nextSibling.preOrderTraversal();
         }


       }

       /**
        * Visit each node's children left to right before visiting the node  itself
        *
        *         7
        *        /\
        *       /  \
        *      /    \
        *     /      \
        *    4        6
        *   /|\       /
        *  / | \     /
        * 1  2  3   5
        *
        * Used as the natural way to sum disk space in the directories
        */
       public void postOrderTraversal()
       {
           if(firstChild != null)
           {
               firstChild.postOrderTraversal();
           }
           visit(this);

           if(nextSibling!=null)
           {
               nextSibling.postOrderTraversal();
           }


       }

       public void visit(SiblingTreeNode node)
       {
           System.out.println(node.item.toString());
       }


   }
}
