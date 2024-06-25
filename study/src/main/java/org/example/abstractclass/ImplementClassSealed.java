package org.example.abstractclass;

non-sealed class ImplementClassSealed extends SealedAbtractClass {
    @Override
    public void getAll() {
        System.out.println("GetAll ImplementClass");
    }

    public static void main(String[] args) {
        SealedAbtractClass ab = new ImplementClassSealed();

        ab.getAll();
    }

    @Override
    protected void getAll2() {

    }
}
