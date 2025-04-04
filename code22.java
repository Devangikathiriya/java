
package pack;

public class Student1 {
    public void message() {
        System.out.println("Hello");
    }
}

package mypack;

import pack.*;

public class Student2 {
    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.message();
    }
}