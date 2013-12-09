package com.data.structures;

/**
 * Created with IntelliJ IDEA.
 * User: bazinga
 * Date: 11/18/13
 * Time: 2:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyLinkedList {

    private MyLink first;
    private MyLink last;


    private class MyLink {

        private int data;
        private MyLink nextLink;

        private MyLink(int data) {
            this.data = data;
            }
    }
}
