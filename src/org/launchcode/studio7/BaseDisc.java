package org.launchcode.studio7;

public abstract class BaseDisc {
    //  Finally, write down the fields needed to define the properties of a CD or DVD (e.g. storageCapacity). Consider:
    //      Which fields are shared by both types of discs, and which ones are unique to each class?
    //      Do any of the fields represent constants?
    //TODO: Properties (Fields) to make:
    //  Transfer rate
    //  Capacity
    //  Data type held

    //  For the behaviors that cannot go into the interface, decide if they could be placed in an abstract class or
    //  if they need to appear in the separate CD and DVD classes.
    // TODO: place these generic behaviors in abstract class - (will make into methods):
        // TODO: Create spin method: They both spin

        // TODO: Create a method to check storage capacity: They both store data

        // TODO: Create a write data method: Data gets written to the discs by using a laser

        // TODO: Create a read data method: The data on the discs can be read by using a laser

        // TODO: Create a method to display the disk properties: Once loaded, they both report information like name, capacity, contents, and disc type.

        // TODO: Create method to determine whether re-writable: Both can be re-writable or read only


}
