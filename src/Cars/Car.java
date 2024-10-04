package src.Cars;

public class Car{

// Members of the class
private String make;
private String owner;

// Constructor
public Car() { 
    this.colour = "sliver";
    this.make = "honda";
}



// Getters and setters, use to modify members
//make property



// Methods - behaviours
public void info (String make)[

    System.out.printf("Make: %s, Owner: %s", this.make, this.owner);

]


}

public String getMake() {
    return make;
}

public void setMake(String make) {
    this.make = make;
}

public String getOwner() {
    return owner;
}

public void setOwner(String owner) {
    this.owner = owner;
}

