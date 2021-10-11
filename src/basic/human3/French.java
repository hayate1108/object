package basic.human3;

class French extends Human {

    public French(String name) {
        super(name);//same as Human(name)
    }

    @Override
    public void sayHello() {
        System.out.println("Bonjour Je m'apelle" + name);
    }
}
