package behaviours;

import people.Visitor;

public interface ISecurity {

    boolean isAllowedto(Visitor visitor);
}
