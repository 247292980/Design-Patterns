package com.lgp.structuralpatterns.defaultadapter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 16:17
 * @DESCRIPTION
 **/
public class ContreteAdapter extends DefaultAdapter {
    @Override
    public int sampleOperation2() {
        return 1;
    }

    public static void main(String[] args) {
        ContreteAdapter contreteAdapter = new ContreteAdapter();
        System.out.println(contreteAdapter.sampleOperation2());
    }
}
