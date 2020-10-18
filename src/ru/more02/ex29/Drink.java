package ru.more02.ex29;

public final class Drink implements Item {
    private int cost;
    private String name;
    private Dish description;

    public Drink(int cost, String name, Dish description)  {
        try{
            this.cost = cost;
            this.name = name;
            this.description = description;
        } catch (IllegalArgumentException e) {
            if ((cost==0)||(name==null)||(description==null)) {
                e.printStackTrace();
            }

        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Dish getDescription() {
        return description;
    }

    @Override
    public void setDescription(Dish description) {
        this.description = description;
    }
}
