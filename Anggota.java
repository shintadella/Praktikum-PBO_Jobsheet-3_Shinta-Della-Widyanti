public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int uang) {
        if (jumlahPinjaman + uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }
    }

    public void angsur(int uang) {
        int minimal = jumlahPinjaman / 10; 
        if (uang < minimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= uang;
        }
    }
}
