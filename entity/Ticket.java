package entity;

import enumetation.EnumCategoryTicket;
import enumetation.EnumTypeTicket;

public class Ticket {
    private EnumTypeTicket type;
    private EnumCategoryTicket category;

    public Ticket(EnumTypeTicket type, EnumCategoryTicket category) {
        this.type = type;
        this.category = category;
    }

    public EnumTypeTicket getType() {
        return type;
    }

    public EnumCategoryTicket getCategory() {
        return category;
    }

    public void setType(EnumTypeTicket type) {
        this.type = type;
    }

    public void setCategory(EnumCategoryTicket category) {
        this.category = category;
    }

}
