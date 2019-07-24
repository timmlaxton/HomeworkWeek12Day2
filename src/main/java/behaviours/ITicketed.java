package behaviours;

import people.Visitor;

public interface ITicketed {

    double defaultprice();

    double priceFor(Visitor visitor);
}
