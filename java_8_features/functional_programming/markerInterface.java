/*
===========================================================
MARKER INTERFACE — COMPLETE DOCUMENTED EXAMPLE
===========================================================

Goal:
We want to allow cashback only to VERIFIED users.

Instead of using boolean flags like:
    boolean isVerified;

We use a MARKER INTERFACE to tag certain classes.

This keeps design clean and scalable.

Marker interface = interface with NO methods
It only marks a class.

===========================================================
STEP 1 — Create Marker Interface
===========================================================

This interface has NO methods.

It exists only to tag a class.

When a class implements it,
the system treats that class differently.
*/

interface VerifiedUser {
    // No methods → marker interface
}

/*
===========================================================
STEP 2 — Base User Class
===========================================================

This is a normal user.
Not verified.
*/

class User {
    String name;

    User(String name) {
        this.name = name;
    }
}

/*
===========================================================
STEP 3 — Premium User Class
===========================================================

This class implements VerifiedUser marker.

This means:
System recognizes it as VERIFIED.

We did not add any new methods.
We only added a marker.
*/

class PremiumUser extends User implements VerifiedUser {

    PremiumUser(String name) {
        super(name);
    }
}

/*
===========================================================
STEP 4 — System That Changes Behavior
===========================================================

PaymentSystem checks:

    instanceof VerifiedUser

If true → give cashback
If false → deny cashback

This is where the marker interface is used.

We are NOT calling any interface method.
We are only checking its presence.
*/

class PaymentSystem {

    static void processCashback(User user) {

        // Marker interface check
        if (user instanceof VerifiedUser) {
            System.out.println(user.name + " gets cashback ✅");
        } else {
            System.out.println(user.name + " not eligible ❌");
        }

    }
}

/*
===========================================================
STEP 5 — Main Program (Execution)
===========================================================

We create:

1 normal user
1 premium verified user

Then run cashback system.
*/

public class Main {

    public static void main(String[] args) {

        // Normal user (not verified)
        User u1 = new User("Rahul");

        // Premium user (verified via marker interface)
        User u2 = new PremiumUser("Anita");

        // Process cashback
        PaymentSystem.processCashback(u1);
        PaymentSystem.processCashback(u2);
    }
}

/*
===========================================================
FULL DRY RUN EXPLANATION
===========================================================

u1 = User("Rahul")
→ does NOT implement VerifiedUser
→ instanceof check = false
→ output: Rahul not eligible ❌

u2 = PremiumUser("Anita")
→ implements VerifiedUser
→ instanceof check = true
→ output: Anita gets cashback ✅

===========================================================
WHY NOT USE A BOOLEAN FLAG?
===========================================================

Bad approach:

class User {
    boolean isVerified;
}

Problems:
- Anyone can toggle flag accidentally
- No compile-time restriction
- Messy logic in large systems
- Hard to enforce design

Marker interface gives:

✔ clean architecture
✔ type-based control
✔ safe system behavior
✔ scalable design
✔ framework-friendly structure

===========================================================
REAL WORLD ANALOGY
===========================================================

Marker interface = VIP badge

You don't DO anything with the badge,
but security sees it and treats you differently.

Same concept here.

===========================================================
END OF DOCUMENT
===========================================================
*/
