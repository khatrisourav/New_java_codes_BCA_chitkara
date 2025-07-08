import java.lang.ref.WeakReference;

class Demo {
    int x;

    Demo(int x) {
        this.x = x;
        System.out.println("Demo object created with x = " + x);
    }

   
}

public class weak {
    public static void main(String[] args) {
        Demo d = new Demo(100);                        // Strong reference
        WeakReference<Demo> weakRef = new WeakReference<>(d); // Weak reference to the same object

        d = null; // Remove strong reference

        System.gc(); // Request garbage collection

        // Check if object is still alive through weak reference
        if (weakRef.get() == null) {
            System.out.println("Object is garbage collected.");
        } else {
            System.out.println("Object is still alive.");
        }
    }
}

