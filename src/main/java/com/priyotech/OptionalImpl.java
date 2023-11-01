package com.priyotech;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.Random;

public class OptionalImpl {

    boolean toggle=true;

    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }

    public boolean isToggle() {
        return toggle;
    }

    public static void main(String[] args) {
        OptionalImpl optionalImpl=new OptionalImpl();
        for (int i = 0; i <10 ; i++) {
            OptionalLong longOptional=optionalImpl.getData();
            System.out.println(longOptional.orElseThrow(() -> new RuntimeException("Error While fetching Data!")));
            optionalImpl.setToggle(!optionalImpl.isToggle());
        }
    }

    public OptionalLong getData(){
        if(this.toggle){

            return OptionalLong.of(new Random().nextLong());
        }
        else{

            return OptionalLong.empty();
        }
    }
}
