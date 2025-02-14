class StringAndStringBuffer {
    public static void main(String args[]) {
        String a = "SRM University AP";
        String aa = "Python";
        int b = a.length();
        int c = a.indexOf("A");
        char d = a.charAt(5);
        String e = a.substring(4, 10);
        String f = a.concat(aa);
        String g = a.replace("AP", "Amaravati");
        boolean h = a.equals(aa);
        String i = a.trim();

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        StringBuffer a1 = new StringBuffer("SRM University AP");
        StringBuffer b1 = new StringBuffer("Python");
        StringBuffer c1 = a1.append(b1);
        int d1 = a1.capacity();
        int e1 = a1.length();
        StringBuffer f1 = a1.insert(4, "at");
        StringBuffer g1 = a1.reverse();
        StringBuffer h1 = a1.delete(4, 6);
        StringBuffer i1 = a1.replace(4, 6, "at");
        String j1 = a1.substring(4,6);

        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);
        System.out.println(h1);
        System.out.println(i1);
        System.out.println(j1);
    }
}