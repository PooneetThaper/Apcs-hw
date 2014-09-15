
import java.io.*;
import java.util.*;

public class Greeter {
    public void greet() {
	System.out.println("Hello world!");
	ungreet();
    }

    private void ungreet() {
	System.out.println("I'm out.");
    }
}