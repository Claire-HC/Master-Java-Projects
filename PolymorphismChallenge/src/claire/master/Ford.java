package claire.master;

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine();";
    }

    @Override
    public String brake() {
        return "Ford -> brake();";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate();";
    }
}


