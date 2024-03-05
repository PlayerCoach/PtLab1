package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {



    public static void main(String[] args)
    {
        Set<Mage> mageSet = null;

        switch (args[0]) {
            case Const.ALT -> mageSet = MageFactory.StartFactory(Const.ALT, mageSet);
            case Const.NATURAL -> mageSet =  MageFactory.StartFactory(Const.NATURAL, mageSet);
            case Const.NONE -> mageSet =  MageFactory.StartFactory(Const.NONE, mageSet);
        }
        System.out.println(mageSet);
        for (Mage mage : mageSet)
        {
            mage.print();

        }

    }
}
