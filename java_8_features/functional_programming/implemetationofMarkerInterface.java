/*
===========================================================
CUSTOM MARKER INTERFACE WITH SPECIAL CAPABILITY
===========================================================

Goal:

Only admin users can delete the database.

We will use marker interface to grant permission.

IMPORTANT:
The capability is NOT inside the interface.
The capability is written in another system class.

Marker interface is just a tag.
===========================================================
*/

/*
STEP 1 — Marker Interface

This is the permission badge.

No methods.
No logic.
Just a tag.
*/
interface AdminAccess {
}

/*
STEP 2 — Normal user
No special permission
*/
class User {
    String name;

    User(String name) {
        this.name = name;
    }
}

/*
STEP 3 — Admin user
Gets special power by implementing marker
*/
class AdminUser extends User implements AdminAccess {

    AdminUser(String name) {
        super(name);
    }
}

/*
STEP 4 — Security system

THIS is where capability is written.

Marker interface only works
because this system checks it.
*/
class SecurityManager {

    static void deleteDatabase(User user) {

        // Permission check using marker interface
        if (user instanceof AdminAccess) {
            System.out.println(user.name + " deleted the database ✅");
        } else {
            System.out.println(user.name + " ACCESS DENIED ❌");
        }
    }
}

/*
STEP 5 — Main program
*/
public class Main {

    public static void main(String[] args) {

        User u1 = new User("Rahul");
        User u2 = new AdminUser("Anita");

        SecurityManager.deleteDatabase(u1);
        SecurityManager.deleteDatabase(u2);
    }
}

/*
===========================================================
DRY RUN
===========================================================

Rahul → normal user
instanceof AdminAccess = false
ACCESS DENIED

Anita → admin user
instanceof AdminAccess = true
database deleted

===========================================================
KEY LESSON
===========================================================

Marker interface does NOTHING alone.

Capability exists because SecurityManager
chooses to respect the marker.

YOU define the power.
YOU write the rule.
YOU decide the permission.

Interface is just a label.
System decides meaning of label.

===========================================================
HOW TO DESIGN YOUR OWN CAPABILITIES
===========================================================

Step 1: Create marker interface
    interface CanFly {}

Step 2: Implement it in class
    class Bird implements CanFly {}

Step 3: System checks it
    if (obj instanceof CanFly)

Step 4: Grant special behavior

You are creating a permission system.

===========================================================
REAL WORLD ANALOGY
===========================================================

Marker interface = ID card
System = security guard

ID card alone does nothing.
Guard reads it and decides access.

===========================================================
END
===========================================================
*/
