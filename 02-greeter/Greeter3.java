
import java.io.*;
import java.util.*;

public class Greeter {
    /* Attributes go here
       we call them instance variables*/
    public string greeting=new String("Hello world!");
    public void greet() {
	System.out.println("Hello world!");
	ungreet();
    }

    private void ungreet() {
	System.out.println("I'm out.");
    }
}
=======

import java.io.*;
import java.util.*;

public class Greeter {
    public void greet() {
	String s=new String ("Hello world");
	System.out.println("Hello world!");
	ungreet();
    }

    public void ungreet() {
	System.out.println("I'm out.");
    }
}

