package basic.human4;

import basic.human3.Human;

class Chinese extends Human {

    //class Chinese
    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("你好。我的名字是"+name);
    }
}
