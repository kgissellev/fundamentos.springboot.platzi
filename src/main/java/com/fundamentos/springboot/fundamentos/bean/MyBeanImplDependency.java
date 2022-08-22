package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImplDependency  implements MyBeanWithDependencies{
    MyOperation myOperation;

    public MyBeanImplDependency(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printDependency() {
        int numero=1;
        myOperation.sum(myOperation.sum(numero));
        System.out.println("Hello implement bean depedency");
    }
}
