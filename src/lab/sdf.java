package lab;

import static lab.NEW.a1;

public class sdf {

    sdf() {

        int i2, n2 = 8, j2, k2, d2, m2 = 0, s2 = 0, min;
        int xyz = 1;
        int oop = 1;
        int col[] = new int[8];
        for (i2 = 0; i2 < n2; i2++) {
            col[i2] = 0;
            for (j2 = 0; j2 < n2; j2++) {

                if (a1[i2][j2] == 0) {
                    a1[i2][j2] = 999;
                }
            }
        }

        col[0] = 1;
        for (k2 = 1; k2 < n2;) {
            for (i2 = 0, min = 999; i2 < n2; i2++) {
                for (j2 = 0; j2 < n2; j2++) {
                    if (a1[i2][j2] < min && col[i2] != 0) {
                        min = a1[i2][j2];
                        m2 = i2;
                        s2 = j2;
                    }
                }
            }

            if (col[m2] == 0 || col[s2] == 0) {
                System.out.println("" + m2 + " -> " + s2);

//                k2++;
                col[s2] = 1;
                a1[m2][s2] = a1[s2][m2] = 1000;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(" " + a1[i][j]);
                    }
                    System.out.println("");
                }
                if (xyz == 1) {
                    graphic1 aa = new graphic1(m2, s2);
                    aa.graphic1();
                } else if (xyz == 2) {
                    graphic1 ab = new graphic1(m2, s2);
                    ab.graphic1();
                } else if (xyz == 3) {
                    graphic1 ac = new graphic1(m2, s2);
                    ac.graphic1();
                } else if (xyz == 4) {
                    graphic1 ad = new graphic1(m2, s2);
                    ad.graphic1();
                } else if (xyz == 5) {
                    graphic1 ae = new graphic1(m2, s2);
                    ae.graphic1();
                } else if (xyz == 6) {
                    graphic1 af = new graphic1(m2, s2);
                    af.graphic1();
                } else if (xyz == 7) {
                    graphic1 ag = new graphic1(m2, s2);
                    ag.graphic1();
                }
                xyz++;
////                graphic1 xzc=new graphic1(m2, s2);
//                xzc.graphic1();
//                graph ab = new graph();

//                break;
            }

            if (a1[m2][s2] < 999 || a1[s2][m2] < 999) {
                a1[m2][s2] = a1[s2][m2] = 999;

            }
            k2++;
//            break;
        }
        graph xxx = new graph();
        

    }

    public static void main(String[] args) {

    }
}
