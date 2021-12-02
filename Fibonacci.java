package kitapSonuOrnekleri;
/*HER ELEMANI KENDİSİNDEN ÖNCEKİ İKİ ELEMANIN TOPLAMI ŞEKLİNDE İFADE EDİLEN FİBONACCİ SERİSİNİ VE FİBONACCİ SERİSİNİN
* SONSUZDAKİ BİR SAYISININ BİR ÖNCEKİ SAYIYA OLAN ALTIN ORANI HESAPLAYAN JAVA PROGRAMI*/
public class Fibonacci {
    public static void main(String[] args) {
        int ysay1=1;
        int ysay2=1;
        int esay=0;
        int sayac=0;
        System.out.println("Fibonacci serisi...");
        do {
            System.out.printf(" " + ysay2);
            ysay2 = esay + ysay1;
            esay = ysay1;
            ysay1 = ysay2;
            sayac = sayac + 1;
        }while (sayac != 15);
        System.out.print("\nAltın Oran.:" + (float) ysay1/esay);
    }
}
