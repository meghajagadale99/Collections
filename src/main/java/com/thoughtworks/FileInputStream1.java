//package com.thoughtworks;
//
//import java.io.File;
//
//public
//class FileInputStream {
//
//    public static
//    void main(String[] args) {
//        FileInputStream fis =null;
//        try {
//            fis = new FileInputStream(new File("/Users/meghaprakashjagadale/Documents/Hello"));
//            System.out.println("File Opend");
//
//            int i;
//            while((i = fis.read())!=-1);
//            System.out.print(i);
//        } catch (Exception e) {
//                e.printStackTrace();
//        }finally {
//            try {
//                fis.clone();
//            } catch (CloneNotSupportedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("file closed");
//        }
//    }
//
//    private
//    int read() {
//        return 0;
//    }
//
//}
