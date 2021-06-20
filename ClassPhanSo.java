import java.util.Scanner;

class PhanSo {
    int tuso;
    int mauso;

    PhanSo(int a, int b) {
        tuso = a;
        mauso = b;
    }

    PhanSo() {
    }

    PhanSo rutgonphanso() {
        int a = this.tuso;
        int b = this.mauso;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        this.tuso /= a;
        this.mauso /= a;
        return this;
    }

    PhanSo CongPhanSo(PhanSo b) {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.mauso * b.mauso;
        ketqua.tuso = this.tuso * b.mauso + b.tuso * this.mauso;
        return ketqua.rutgonphanso();
    }


    PhanSo TruPhanSo(PhanSo b) {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.mauso * b.mauso;
        ketqua.tuso = this.tuso * b.mauso - b.tuso * this.mauso;
        return ketqua.rutgonphanso();
    }

    PhanSo NhanPhanSo(PhanSo b) {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.mauso * b.mauso;
        ketqua.tuso = this.tuso * b.tuso;
        return ketqua.rutgonphanso();
    }

    PhanSo ChiaPhanSo(PhanSo b) {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.mauso * b.tuso;
        ketqua.tuso = this.tuso * b.mauso;
        return ketqua.rutgonphanso();
    }

    PhanSo CongPhanSo(int b) {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.mauso;
        ketqua.tuso = this.tuso * b * this.mauso;
        return ketqua.rutgonphanso();
    }

    PhanSo TruPhanSo(int b) {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.mauso;
        ketqua.tuso = this.tuso - b * this.mauso;
        return ketqua.rutgonphanso();
    }

    PhanSo NhanPhanSo(int b) {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.mauso;
        ketqua.tuso = this.tuso * b;
        return ketqua.rutgonphanso();
    }

    PhanSo ChiaPhanSo(int b) {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.mauso * b;
        ketqua.tuso = this.tuso;
        return ketqua.rutgonphanso();
    }

    float GiaTriThapPhan() {
        float ketqua;
        ketqua = this.tuso / this.mauso;
        return ketqua;
    }

    PhanSo NghichDaoPhanSo() {
        PhanSo ketqua = new PhanSo();
        ketqua.mauso = this.tuso;
        ketqua.tuso = this.mauso;
        return ketqua;
    }

    void print() {
        System.out.println("tuso: " + tuso);
        System.out.println("mauso: " + mauso);
    }

}

public class ClassPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(2, 4);
        PhanSo b = new PhanSo(3, 9);

        a.print();
        System.out.println("Rut gon:");
        a.rutgonphanso().print();

        b.print();
        System.out.println("Rut gon:");
        b.rutgonphanso().print();

        a.print();
        b.print();

        System.out.println("Cong hai phan so:");
        a.CongPhanSo(b).print();

        System.out.println("Tru hai phan so:");
        a.TruPhanSo(b).print();

        System.out.println("Nhan hai phan so:");
        a.NhanPhanSo(b).print();

        System.out.println("Chia hai phan so:");
        a.ChiaPhanSo(b).print();

        System.out.println("Cong voi so nguyen:");
        a.CongPhanSo(3).print();

        System.out.println("Tru voi so nguyen:");
        a.TruPhanSo(3).print();

        System.out.println("Nhan voi so nguyen:");
        a.NhanPhanSo(3).print();

        System.out.println("Cong voi so nguyen:");
        a.ChiaPhanSo(3).print();

        System.out.println("Gia tri thap phan cua: ");
        a.print();
        System.out.println(a.GiaTriThapPhan());

        System.out.println("Nghich Dao Phan So: ");
        a.NghichDaoPhanSo().print();
    }
}

